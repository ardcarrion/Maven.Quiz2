package com.zipcodewilmington.assessment2.part2;
//
//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

public class Router {
    private Map map;

    public Router() {
        this.map = new LinkedHashMap();
    }

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return (String)map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        map.forEach((key, value) -> result.append(key).append(value).append("\n"));
        return result.toString();
    }
}
