package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    Map<String, String> router;

    public Router() {
        router = new TreeMap<String, String>();
    }

    public void add(String path, String controller) {
        router.put(path, controller);
    }

    public int size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String newController) {
        router.put(path, newController);
    }

    public void remove(String path) {
        router.remove(path);
    }

    public String toString() {
        Set treeSet = router.entrySet();
        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            Map.Entry integer = (Map.Entry) iterator.next();
            return integer.getKey() + " -> " + integer.getValue() + "\n" + integer.getKey() + " -> " + integer.getValue() + "\n" + integer.getKey() + " -> " + integer.getValue() + "\n";
        }
        return null;
    }
}
