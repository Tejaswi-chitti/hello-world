package org.hibernate;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.criterion.Restrictions;
import org.jnit.task.jsf.Employee;

@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean {

	private String firstName;
	private String lastName;
	private String dob;
	private String address;
	private String zipCode;
	private String state;
	private String city;
	private List<Employee> listEmployees;

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String Save() {
		String result = "null";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tran = session.beginTransaction();
		Employee employee = new Employee();
		employee.setFirstName(this.getFirstName());
		employee.setLastName(this.getLastName());
		employee.setDob(this.getDob());
		employee.setAddress(this.getAddress());
		employee.setZipCode(this.getZipCode());
		employee.setState(this.getState());
		employee.setCity(this.getCity());

		session.save(employee);
		tran.commit();
		session.close();
		return result;
	}

	/*
	 public List<Employee> searchEmployers(){ Session
	 session=HibernateUtil.getSessionFactory().openSession(); List<Employee>
	 employeeList=session.createCriteria(Employee.class).list(); 
	 return employeeList; 
	 }
	 */
	public void reset() {
		this.setFirstName("");
		this.setLastName("");
		this.setDob("");
		this.setAddress("");
		this.setZipCode("");
		this.setState("");
		this.setState("");
		this.setCity("");
	}

	public void searchState() {

		if (this.getState() != null & this.getState().length() > 0) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.eq("state", this.getState()));
			listEmployees = criteria.list();
			session.close();
		}
	}
	
	public List<Employee> getListEmployees() {
		return listEmployees;
	}
}
