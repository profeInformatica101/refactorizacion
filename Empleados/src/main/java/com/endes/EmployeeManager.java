package com.endes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	List<Employee>  employees;
	
	
    public EmployeeManager() {
		super();
		employees = new ArrayList<Employee>();
	}

    /**
     * Nos permite añadir un empleado
     * @param name
     * @param years
     */
    public void addEmployee(String name, int years) {
    	Employee empoyee = new Employee(name, years);
    	employees.add(empoyee);
    }
    

    /**
     * Imprime los empleados
     */
	public void printEmployees() {
        System.out.println("List of employees:");
        for(Employee e : employees) {
        	System.out.println("Nombre: " + e.getName());
        	System.out.println("Años: " + e.getYear());
        }
        	
        }
    
}
