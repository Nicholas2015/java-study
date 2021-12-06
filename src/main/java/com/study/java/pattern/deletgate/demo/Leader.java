package com.study.java.pattern.deletgate.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Leader implements IEmployee {

    private Map<String,IEmployee> map = new HashMap<>();

    public Leader(){
        map.put("JavaDevelop",new EmployeeA());
        map.put("Design",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        IEmployee employee = map.get(task);
        if (Objects.nonNull(employee)) {
            employee.doing(task);
        } else {
            System.out.println("我做不了");
        }
    }
}
