package com.usta.nondecoupling;

/**
 * Created by IntelliJ IDEA.
 * User: usta
 * Date: 03.03.2012
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
public class YazdirmaServisi {

    public LazerYazici y;

    public YazdirmaServisi() {
           y=new LazerYazici(); // YazdirmaServisi Lazer yazıcıya sıkı sıkıya bağlı

    }

}
