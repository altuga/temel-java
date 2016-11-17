package com.usta.ornek1;

/**
 * Generic version of the com.usta.ornek1.Box class.
 * @param <T> the type of value being boxed
 */
public class Box<T> {

    private T t; // T stands for "Type"

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
