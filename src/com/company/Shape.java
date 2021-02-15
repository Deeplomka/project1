package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public void addPoint(Point point){
        points.add(point);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
    public double averageDistance(){
        double distance = 0.0;
        for(int i=0; i < points.size(); i++){
            if(i == points.size() - 1){
                distance += Point.distance(points.get(i), points.get(0));
            }
            else {
                distance += Point.distance(points.get(i), points.get(i + 1));
            }

        }
        return distance / points.size();
    }
}
