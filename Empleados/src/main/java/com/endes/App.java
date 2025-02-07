package com.endes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   EmployeeManager manager = new EmployeeManager();
           manager.addEmployee("John Doe", 5);
           manager.addEmployee("Jane Smith", 2);
           manager.printEmployees();
    }
}
