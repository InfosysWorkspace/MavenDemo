package org.example.validator;

import org.apache.commons.logging.LogFactory;
import org.example.model.Employee;

public class Validator {

    public void validate(Employee employee) throws Exception {
        try {
            if(employee.getName()==null || employee.getName().isBlank())
                throw new Exception("Validator.INVALID_EMPLOYEE_NAME");
            if(employee.getEmpId()==null || employee.getEmpId()<1000)
                throw new Exception("Validator.INVALID_EMPLOYEE_ID");
        }
        catch(Exception Exception) {
            LogFactory.getLog(this.getClass()).error(Exception.getMessage(), Exception);
                throw Exception;
        }
    }
}
