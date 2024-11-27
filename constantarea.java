import java.util.Scanner ;
public class ConstantArea {
public static void main(String[] args) {

final double PI = 3.14159;
//create scanner object
Scanner input = new Scanner(System.in);

//prompt the user to enter a radius
System.out.println(" Enter a number for radius " );
double radius = input.nextDouble();

//compute the area 
double area = radius * radius * PI ;

//display results
System.out.println(" The area for a circle of radius " + radius + " is " +area );

    
}
}