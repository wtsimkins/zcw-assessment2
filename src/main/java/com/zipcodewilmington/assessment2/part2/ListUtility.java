package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUtility {
    List<Integer> integers = new ArrayList<Integer>();

    public ListUtility(){
    }


    public void add(Integer number){
        integers.add(number);
    }

    public int size(){
        return integers.size();
    }

    public List<Integer> getUnique(){
        List<Integer> List = new ArrayList<Integer>();
        return List;
    }

}
