package com.company;

import com.company.controller.EmployeeController;
import com.company.model.Employee;
import com.company.view.EmployeeDashboardView;

public class Main {

    public static void main(String[] args) {

        Employee employee = retrieveEmployeeFromServer();

        //Create our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Create our controller
        EmployeeController controller = new EmployeeController(employee, view);



//        controller.setEmployee(employee.getFirstName(), employee.getLastName());

        controller.updateDashboardView();



    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("8643257");
        employee.setFirstName("Ram");
        employee.setLastName("Sharma");
        employee.setSalary(500000);

        return employee;

    }
}
