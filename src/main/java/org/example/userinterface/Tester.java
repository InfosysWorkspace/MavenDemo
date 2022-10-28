package org.example.userinterface;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.example.model.Employee;
import org.example.validator.Validator;

public class Tester {

    public static void main(String[] args) throws Exception{
        try {
            Employee employee = new Employee("Jon", 1234);
            new Validator().validate(employee);
            System.out.println("The employee details are successfully validated.");
        }
        catch (Exception exception) {
            System.out.println(new Configurations().properties("configuration.properties").getProperty(exception.getMessage()));
        }
    }
}
