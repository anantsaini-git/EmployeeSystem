package com.employeesystem.restservices;

import com.employeesystem.resource.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestService {

    @RequestMapping(method = RequestMethod.GET, path="/getEmployee")
    public Employee getEmployee () {
        return new Employee("1", "Anant Saini", "PM");
    }
}
