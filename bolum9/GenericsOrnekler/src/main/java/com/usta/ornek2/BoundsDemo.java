package com.usta.ornek2;

// Demonstrate Stats.
class BoundsDemo {
    public static void main(String args[]) {

        Integer inums[] = { 1, 2, 3, 4, 5 };
        StatsDogru<Integer> iob = new StatsDogru<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        StatsDogru<Double> dob = new StatsDogru<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        // This won't compile because String is not a
        // subclass of Number.
//    String strs[] = { "1", "2", "3", "4", "5" };
//    StatsDogru<String> strob = new StatsDogru<String>(strs);

//    double x = strob.average();
//    System.out.println("strob average is " + v);

    }
}