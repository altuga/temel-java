package com.usta.ornek1;

/**
* @see Box
 */

public class BoxDemo1 {

    public static void main(String[] args) {

        // ONLY place Integer objects 
        // into this box!
        Box integerBox = new Box();

        integerBox.add(new Integer(10));
        Integer someInteger = (Integer)integerBox.get();
        integerBox.get();
        System.out.println(someInteger);
    }
}
