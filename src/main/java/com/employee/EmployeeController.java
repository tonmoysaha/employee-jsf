package com.employee;

import com.employee.bean.Employee;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Scope(value = "session")
@Component(value = "employeeList")
@ELBeanName(value = "employeeList")
@Join(path = "/", to = "/employee-list.xhtml")
public class EmployeeController {

    private List<Employee> products;

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        products = Arrays.asList(new Employee());
    }

    public List<Employee> getProducts() {
        return products;
    }
}
