package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class TestPoint {
        public static void main(String[] args) {
            Point p1 = new Point(6, 2);
            Point p2 = new Point(10, 4);

            System.out.println("Distance between them is " + distance(p1, p2));
        }
}
