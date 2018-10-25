/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the e
 */
package shapes;
import java.util.Scanner;
/**
 *
 * @author hkkanwar
 */
 public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.print("Please choose a shape: Circle(1), Octogon (2), Parallelogram (3), Rectangle(4) or Triangle (5)");
Scanner input = new Scanner (System.in);
int type = input.nextInt();

     Circle circ;
     Triangle tri;

switch (type) {
 case 1:
   System.out.print("Please enter the radius of the circle: ");
   double radius = input.nextDouble();
    circ = new Circle(radius);
   printInfo(circ);
   printInfo("the end");
   break;

 case 2:
   System.out.print("Please enter the side length of the octogon: ");
    double side = input.nextDouble();
   break;

 case 3:
    System.out.print("Please enter the base of the parallelogram: ");
    double base = input.nextDouble();
    System.out.print("Please enter the height of the parallelogram: ");
    double height = input.nextDouble();
   break;

 case 4:
   System.out.print("Please enter the width of the rectangle: ");
    double width = input.nextDouble();
    System.out.print("Please enter the height of the rectangle: ");
    double h = input.nextDouble();
   break;

 case 5:
  System.out.print("Please enter the length of side A of the triangle: ");
    double a = input.nextDouble();
    System.out.print("Please enter the length of side B of the triangle: ");
    double b = input.nextDouble();
    System.out.print("Please enter the length of side C of the triangle: ");
    double c = input.nextDouble();
     tri = new Triangle(a,b,c);
     printInfo(tri);
   break;

 default:
   type = 0;
    System.out.print("Invalid Shape");
 }
  }

// helper function
// overridding based on interface which is passed
public static void printInfo(ShapeInterface s) {
System.out.println("The shape: " + s);
System.out.println("area : " + s.area());
System.out.println("perim: " + s.perimeter());
System.out.println();
}

//overloading 
public static void printInfo(String s ){
System.out.printf("%s",s);
    }


}