package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    public List<String> tails(String value) {
        List<String> tail = new ArrayList<>(value.length() + 1);
        for(int i = 0; i < value.length() + 1; i++)
        {
            tail.add(value.substring(i));
        }
        return tail;
    }

}
