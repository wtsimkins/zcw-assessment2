package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;

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
       Set<Integer> uniqueValues = new HashSet<Integer>(integers);
        integers.clear();
        integers.addAll(uniqueValues);

        return integers;

    }

    public String join(){
        StringBuilder sb  = new StringBuilder();
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext())
        {
            sb.append(iterator.next());
            if(iterator.hasNext()){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public Integer mostCommon() {
        Collections.sort(integers);
        Integer prev = null;
        Integer mostCommon = null;
        int num = 0, max = 0;
        for (Integer integer : integers) {
            if (integer.equals(prev)) {
                num++;
            } else {
                if (num > max) {
                    max = num;
                    mostCommon = integer;
                }
                num = 1;
                prev = integer;
            }
        }
            return prev;

    }

}
