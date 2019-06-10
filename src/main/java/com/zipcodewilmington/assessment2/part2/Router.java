package com.zipcodewilmington.assessment2.part2;
//
//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Router {
    private Map map;

    public Router() {
        this.map = new HashMap();
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
        Collection<String> keys = map.values();
        for (String key : keys) {
            result.append(String.format("%s -> %s\n", key, map.get(key)));
        }
        return result.toString();
    }
}
