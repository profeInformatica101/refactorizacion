package com.endes;

/**
 * @version 0.1
 * @author jpdm
 */
public class Employee {

	private String name;
	private Integer year;
	
	
	/**
	 * Constructor de Empleado
	 * @param name nombre del empleado
	 * @param year años en la empresa
	 */
	public Employee(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
}
