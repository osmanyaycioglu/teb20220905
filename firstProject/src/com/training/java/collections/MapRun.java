package com.training.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapRun {

    public static class EmployeeDepartmentWrapper {

        public HashMap<String, Employee> map = new HashMap<>();

    }

    public static void main(final String[] args) {
        Map<String, Employee> mapLoc = new HashMap<>();
        Map<String, Employee> map2Loc = new ConcurrentHashMap<>(1_200_000,
                                                                0.9F,
                                                                1_000);
        Map<String, Employee> map3Loc = new Hashtable<>();
        mapLoc.put("user1",
                   new Employee("osman",
                                "yay"));
        mapLoc.put("user1",
                   new Employee("ali",
                                "veli"));

        Employee employeeLoc = mapLoc.get("user1");
        mapLoc.put(null,
                   new Employee("bug",
                                "bugger"));
        mapLoc.put(null,
                   new Employee("bug1",
                                "bugger2"));

        Set<String> keySetLoc = mapLoc.keySet();
        for (String stringLoc : keySetLoc) {
            Employee employee2Loc = mapLoc.get(stringLoc);
        }

        Collection<Employee> valuesLoc = mapLoc.values();
        for (Employee employee2Loc : valuesLoc) {
            System.out.println(employee2Loc);
        }

        Set<Entry<String, Employee>> entrySetLoc = mapLoc.entrySet();
        for (Entry<String, Employee> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            Employee valueLoc = entryLoc.getValue();
        }

        HashMap<String, EmployeeDepartmentWrapper> hashMapLoc = new HashMap<>();

    }
}
