package com.usta.ornek1;

public class BoxDemo3 {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        // no cast!
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
