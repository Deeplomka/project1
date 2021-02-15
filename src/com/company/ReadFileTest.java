// author: Abulkhair Zhamiyev
// Class for reading data from file
package com.company;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFileTest {
    public static void main(String[] args){
        try {
//            Point point = new Point(3, 2);
//            Point point2 = new Point();
//            point2.setX(7);
//            point2.setY(6);
//            System.out.print("This is x: ");
//            System.out.println(point.getX());
//            System.out.print("This is x: ");
//            System.out.println(point.getY());

            File myObj = new File("/Users/Abulkhair/Desktop/aitu/oop/file1.txt");
            File myObj2 = new File("/Users/Abulkhair/Desktop/aitu/oop/file2.txt");
            // File myObj2 = new File("/Users/Abulkhair/Desktop/aitu/oop/lectures_oop/lectures_oop/file3.txt");
            Scanner myReader = new Scanner(myObj); // cin>> object
            Shape shape = new Shape();
            Shape shape2 = new Shape();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(!data.isBlank()) {

                    Point point1 = new Point(data);
                    shape.addPoint(point1);
//                    System.out.printf("This is x: %d%n", point1.getX());
//                    System.out.printf("This is x: %d%n", point1.getY());
                }

                // System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
