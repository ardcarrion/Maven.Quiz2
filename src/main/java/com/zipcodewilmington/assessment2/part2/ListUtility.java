package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import org.omg.PortableInterceptor.INACTIVE;
import com.zipcodewilmington.assessment2.part2.ArrayUtility;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {

    private LinkedList<Integer> list;

    public ListUtility() {
        this.list = new LinkedList<>();

    }

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        List<Integer> result = new LinkedList<>();
        for (Integer i : list) {
            if (!result.contains(i)) result.add(i);
        }
        return result;
    }

    public String join() {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (Integer i : list) {
            if (count == list.size()) result.append(String.valueOf(i));
            else result.append(String.format("%d, ", i));
            count++;
        }
        return result.toString();
    }

    public Integer mostCommon() {
        Integer[] values = new Integer[list.size()];
        list.toArray(values);
        return ArrayUtility.mostCommon(values);
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
