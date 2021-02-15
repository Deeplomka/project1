// author: Abulkhair Zhamiyev
// Point class, which takes a string line as an argument
package com.company;

import java.util.ArrayList;

public class Point {
    //coordinate x
    private int x;
    // coordinate y
    private int y;
    private static int id_gen = 0;
    private int id;
    // No-arg constructor
    public Point(){
        id = id_gen++; // auto-increment
    }

    // parameterized constructor which has two integer values in parameter list
    public Point(int x, int y){
        this();
        setX(x);
        setY(y);
    }

    // parameterized constructor which takes string line as parameter
    public Point(String line){
        this();
        // We need to use split() function to split string into two parts
        // -3, 9

        String[] splittedLine = line.split(",");
        // splittedLine[0] = "-3"
        // splittedLine[1] = " 9"
        // We need to parse string to integer
        this.x = tryParseInt(splittedLine[0]) ?  Integer.parseInt(splittedLine[0]) : 0;
        //Because the second part contains leading space, we need to remove space
        // We can use trim() function, it will remove leading and trailing spaces from String
        this.y = tryParseInt(splittedLine[1].trim()) ? Integer.parseInt(splittedLine[1].trim()) : 0;
        // 9
        // Here is output of x and y vertices using printf
        // System.out.printf("This is x: %d%n", this.x);// %d stands for integer values, whereas %n stands for the newline
        // System.out.printf("This is y: %d%n", this.y);
    }

    // Id attribute is read-only, that's why there is no need to provide setter
    public int getId() {
        return id;
    }
    // Here given getters and setters of point;

    private boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(p1.getX() * p2.getX() + p1.getY()*p2.getY());
    }

    public ArrayList<Point> getPoints(){
        ArrayList arrL = new ArrayList();
        return arrL;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
