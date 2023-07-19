package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> myset = new MySet<>();
        myset.add(2);
        myset.add(554);
        myset.add(2);
        myset.add(12164);
        System.out.println(myset.toString());
        myset.remove(554);
        Iterator<Integer> iter = myset.iterator();
        System.out.println(myset.findElem(0));
    }
}

class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object Mio = new Object();

    public boolean add(T value) {
        return map.put(value, Mio) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == Mio;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public Object findElem(Integer value) {
        Object[] key = map.keySet().toArray();
        return key[value];
    }
}