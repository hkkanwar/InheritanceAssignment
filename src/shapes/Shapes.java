/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the e
 */
package shapes;
import java.util.InputMismatchException;
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
        //get user input
    System.out.print("Please choose a shape: Circle(1), Octogon (2), Parallelogram (3), Rectangle(4) or Triangle (5)");
    Scanner input = new Scanner (System.in);
    int type = 0;
    
    try{
        type = input.nextInt();
        Circle circ;
        Triangle tri;
        Rectangle rec;
        Octagon oct;
        Parallelogram parlg;
        
    //call specific class depending on input of user
switch (type) {
 case 1:
    //get input of data required for calculations
    System.out.print("Please enter the radius of the circle: ");
    double radius = input.nextDouble();
    circ = new Circle(radius);
   printInfo(circ);   
   break;

 case 2:
    System.out.print("Please enter the side length of the octogon: ");
    double side = input.nextDouble();
    oct = new Octagon(side);
    printInfo(oct);    
    break;

 case 3:      
    System.out.print("Please enter the base of the parallelogram: ");
    double base = input.nextDouble();
    System.out.print("Please enter the height of the parallelogram: ");
    double height = input.nextDouble();
    parlg = new Parallelogram(base,height);
    printInfo(parlg);
     break;

 case 4:
    System.out.print("Please enter the width of the rectangle: ");
    double width = input.nextDouble();
    System.out.print("Please enter the height of the rectangle: ");
    double h = input.nextDouble();
    rec = new Rectangle(width,h);
    printInfo(rec);
    break;

 case 5:
       System.out.print("Please enter the length of side A of the triangle: ");    
        double a =input.nextDouble();
        System.out.print("Please enter the length of side B (base) of the triangle: ");
        double b = input.nextDouble();
        System.out.print("Please enter the length of side C of the triangle: ");
        double c = input.nextDouble();
        System.out.print("Please enter the length of the height of the triangle: ");
        double ht = input.nextDouble();
        tri = new Triangle(a,b,c, ht);
        printInfo(tri);
       break;
 default:
     //if no acceptable integer value is entered 
    printInfo("Invalid input for shape");
 }

    printInfo("The End");
}
//error handling
catch (InputMismatchException e){
       System.out.println(" You must enter valid input. Program exited");
     }
 }


// overridding based on interface which is passed
public static void printInfo(ShapeInterface s) {
System.out.println("Area :" + s.area());
System.out.println("Perimeter : " + s.perimeter());
System.out.println();
}

//overloading 
public static void printInfo(String s ){
System.out.printf("%15s",s);
 }


}