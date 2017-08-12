package org.jnit.task.jsf;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="DOB")
	private String dob;
	@Column(name="Address")
	private String address;
	@Column(name="ZipCode")
	private String zipCode;
	@Column(name="State")
	private String state;
	@Column(name="City")
	private String city;

	public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}
    public String getFirstName() {
		return firstName;
	}
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public String getLastName() {
		return lastName;
	}
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public String getDob() {
		return dob;
	}
    public void setDob(String dob) {
		this.dob = dob;
	}
    public String getZipCode() {
		return zipCode;
	}
    public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
    public String getState() {
		return state;
	}
    public void setState(String state) {
		this.state = state;
	}
    public String getCity() {
		return city;
	}
    public void setCity(String city) {
		this.city = city;
	}
    @Override
     public String toString() {
      StringBuffer strBuff = new StringBuffer();
      strBuff.append("id : ").append(id);
      strBuff.append("firstName : ").append(firstName);
      strBuff.append(" lastName : ").append(lastName);
      strBuff.append(" dob : ").append(dob);
      strBuff.append(" address : ").append(address);
      strBuff.append(" zipCode : ").append(zipCode);
      strBuff.append(" state : ").append(state);
      strBuff.append(" city : ").append(city);
      return strBuff.toString();
     }

 
}
