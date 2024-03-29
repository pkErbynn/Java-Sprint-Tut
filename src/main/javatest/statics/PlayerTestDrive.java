/*
* This program counts the number of objects
* created for a class making use of static variables
* */

package statics;

import java.util.ArrayList;

public class PlayerTestDrive {

    private int size;

    static String color = "Blue";

    //static initializer alternative
    public static final int PAPA_VALUE;
    static {
        PAPA_VALUE = (int) Math.random();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Papa");
        Player two = new Player("John");
        System.out.println(Player.playerCount);

        PlayerTestDrive pt = new PlayerTestDrive();
        pt.setSize(20);
        System.out.println(pt.getSize());

//        System.out.println(size); // Error! ... cannot access non-static variable from a static method

        System.out.println(color); // static method can access static variables

        ArrayList list = new ArrayList();
        int x = 5;
        Integer wInt = new Integer(x);
        boolean add = list.add(x);




    }

    public void nonStatic(){
        System.out.println(PlayerTestDrive.color);
    }


}
