package com.linecom;
import java.util.Scanner;
public class GreaterLessEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 coordinates");
        int x1 = sc.nextInt();
        System.out.println("Enter x2 coordinates");
        int x2 = sc.nextInt();
        System.out.println("Enter y1 coordinates");
        int y1 = sc.nextInt();
        System.out.println("Enter y2 coordinates");
        int y2 = sc.nextInt();
        int x3 = 2, x4 = 3, y3 = 2, y4 = 3;
        float line1 = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the line = " + line1);
        System.out.println("Length of the line1 = " + line1);
        float line2 = (float) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of the line = " + line2);
        System.out.println("Length of the line2 = " + line2);
        if (line1 == line2) {
            System.out.println("Lines are equal");
        } else if (line1 > line2) {
            System.out.println("Line1 is greater then Line2");
        } else if (line1 < line2) {
            System.out.println("Line1 is less then Line2");
        } else {
            System.out.println("Lines are not equal");
        }
    }}




