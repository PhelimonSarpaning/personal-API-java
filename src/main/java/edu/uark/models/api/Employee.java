package edu.uark.models.api;

import java.time.LocalDateTime;
import java.util.UUID;

import edu.uark.models.entities.EmployeeEntity;

public class Employee {
	private UUID recordid;
	public UUID getId() {
		return this.recordid;
	}
	public Employee setId(UUID recordid) {
		this.recordid = recordid;
		return this;
	}
	
	private String employeeID;
	public String getEmployeeID() {
		return this.employeeID;
	}
	public Employee setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
		return this;
	}
	
	private String f_name;
	public String getFirstName() {
		return this.f_name;
	}
	public Employee setFirstName(String f_name) {
		this.f_name = f_name;
		return this;
	}
	
	private String l_name;
	public String getLastName() {
		return this.l_name;
	}
	public Employee setLastName(String l_name) {
		this.l_name = l_name;
		return this;
	}
	
	private String role;
	public String getRole() {
		return this.role;
	}
	public Employee setRole(String role) {
		this.role = role;
		return this;
	}
	
	private String manage;
	public String getManage() {
		return this.manage;
	}
	public Employee setManage(String manage) {
		this.manage = manage;
		return this;
	}
	
	private String active;
	public String getActive() {
		return this.active;
	}
	public Employee setActive(String active) {
		this.active = active;
		return this;
	}
	
	private String password;
	public String getPassword() {
		return this.password;
	}
	public Employee setPassword(String password) {
		this.password = password;
		return this;
	}
	
	
	private LocalDateTime stamp;
	public LocalDateTime getStamp() {
		return this.stamp;
	}
	public Employee setStamp(LocalDateTime stamp) {
		this.stamp = stamp;
		return this;
	}
	
	public Employee() {
		this.employeeID = "";
		this.f_name = "";
		this.l_name = "";
		this.active = "";
		this.role = "";
		this.manage = "";
		this.password = "";
		this.recordid = new UUID(0, 0);
		this.stamp = LocalDateTime.now();
	}
	
	public Employee(EmployeeEntity employeeEntity) {
		this.recordid = employeeEntity.getId();
		this.employeeID = employeeEntity.getEmployeeID();
		this.f_name = employeeEntity.getFirstName();
		this.l_name = employeeEntity.getLastName();
		this.active = employeeEntity.getActive();
		this.role = employeeEntity.getRole();
		this.manage = employeeEntity.getManage();
		this.password = employeeEntity.getPassword();
		this.stamp = employeeEntity.getCreatedOn();
	}
}
