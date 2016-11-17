package com.usta.ornek1;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo4 {

    public static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<U>();
        box.add(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box: boxes) {
            U boxContents =   box.get();
            //Integer boxContents = (Integer) box.get();

            System.out.println(
                    "com.usta.ornek1.Box #" + counter + " contains [" +
                            boxContents.toString() + "]");
            counter++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<Box<Integer>>();

        BoxDemo4.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        BoxDemo4.addBox(Integer.valueOf(20), listOfIntegerBoxes);
        BoxDemo4.addBox(Integer.valueOf(30), listOfIntegerBoxes);
        BoxDemo4.outputBoxes(listOfIntegerBoxes);
    }
}
