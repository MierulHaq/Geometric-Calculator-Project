import java.text.DecimalFormat;

import java.util.*;

public class GeometryCalc1 {

    //declaring and create scanner
    Scanner sc = new Scanner(System.in);

    //declare global variables
    public double area, volume, radius, height, length, width, base;
    public String shape;

    //instantiate method for 2 dimension objects
    public void shape2D()
    {
        System.out.println("==========================2D SHAPE LISTS==========================");
        System.out.println("||\t\t\t> rectangle\t\t\t\t\t> square\t\t\t\t||\n||\t\t\t> triangle\t\t\t\t\t> circle\t\t\t\t||");
        System.out.println("==================================================================");
        //prompt user to choose, which 2 dimension object wanted to be calculated.
        System.out.print("Choose 2D shape (type) : ");
        //get input from user
        shape = sc.next();

        //Selection statements for each 2 dimension objects

        //This section will be executed if user prompt in rectangle.
        if(shape.equals("rectangle")){
            System.out.println("\nRECTANGLE");
            for(int i=0; i<4; i++){
                for(int j=0; j<12; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
            //prompt user for the length value
            System.out.print("Enter length : ");
            //length value added in the system
            length = sc.nextDouble();
            //prompt user for the width value
            System.out.print("Enter width : ");
            //width value added in the system
            width = sc.nextDouble();
            //process to calculate area of rectangle
            area = length * width;
            System.out.println("\nRectangle area : "+new DecimalFormat("0.00").format(area)+" unit");
            System.out.println("==================================================================");
        }

        //This section will be executed if user prompt in square.
        else if(shape.equals("square")){
            System.out.println("\nSQUARE");
            for(int i=0; i<4; i++){
                for(int j=0; j<5; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
            //prompt user for the length value
            System.out.print("Enter length : ");
            //length value added in the system
            length = sc.nextDouble();
            //process to calculate area of square
            area = length * length;
            System.out.println("Square area : "+new DecimalFormat("0.00").format(area));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in triangle.
        else if(shape.equals("triangle")){
            System.out.println("\nTRIANGLE");
            //prompt user for the base value
            System.out.print("Enter base : ");
            //base value added in the system
            base = sc.nextDouble();
            //prompt user for the height value
            System.out.print("Enter height : ");
            //height value added in the system
            height = sc.nextDouble();
            //process to calculate area of triangle
            area = base * height * 0.5;
            System.out.println("Triangle area : "+new DecimalFormat("0.00").format(area));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in circle.
        else if(shape.equals("circle")){
            System.out.println("\nCIRCLE");
            //prompt user for the radius value
            System.out.print("Enter radius : ");
            //radius value added in the system
            radius = sc.nextDouble();
            //process to calculate area of circle
            area = 3.142 * radius * radius;
            System.out.println("Circle area : "+new DecimalFormat("0.00").format(area));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in another object from listed above.
        else{
            System.out.print("SORRY, THIS PROGRAM DOES NOT SUPPORT THE 2D SHAPE ENTERED!!\nPLEASE RE-ENTER THE 2D SHAPE AND");
            System.out.println(" CHECK YOUR SPELLING");
            System.out.println("__________________________________________________________________");
        }
    }

    //instantiate method for 3 dimension objects
    public void shape3D()
    {
        System.out.println("==========================3D SHAPE LISTS==========================");
        System.out.println("||\t\t\t> cylinder\t\t\t\t\t> sphere\t\t\t\t||\n||\t\t\t> cuboid\t\t\t\t\t> cone\t\t\t\t    ||");
        System.out.println("==================================================================");
        //prompt user to choose, which 3 dimension object wanted to be calculated.
        System.out.print("Enter your shape : ");
        //get input from user
        shape = sc.next();

        //Selection statements for each 3 dimension objects

        //This section will be executed if user prompt in cylinder.
        if(shape.equals("cylinder")){
            System.out.println("\nCYLINDER");
            //prompt user for the radius value
            System.out.print("Enter radius : ");
            //radius value added in the system
            radius = sc.nextDouble();
            //prompt user for the height value
            System.out.print("Enter height : ");
            //height value added in the system
            height = sc.nextDouble();
            //process to calculate area of cylinder
            area = (2 * 3.142 * radius * height) + (3.142 * radius * radius);
            //process to calculate volume of cylinder
            volume = 3.142 * radius * radius * height;
            System.out.println("Cylinder area : "+new DecimalFormat("0.00").format(area));
            System.out.println("Cylinder volume : "+new DecimalFormat("0.00").format(volume));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in sphere.
        else if(shape.equals("sphere")){
            System.out.println("\nSPHERE");
            //prompt user for the radius value
            System.out.print("Enter radius : ");
            //radius value added in the system
            radius = sc.nextDouble();
            //process to calculate area of sphere
            area = 4 * 3.142 * radius * radius;
            //process to calculate volume of sphere
            volume = (4 * 3.142 * radius * radius * radius) / 3;
            System.out.println("Sphere area : "+new DecimalFormat("0.00").format(area));
            System.out.println("Sphere volume : "+new DecimalFormat("0.00").format(volume));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in cuboid.
        else if(shape.equals("cuboid")){
            System.out.println("\nCUBOID");
            //prompt user for the length value
            System.out.print("Enter length : ");
            //length value added in the system
            length = sc.nextDouble();
            //prompt user for the width value
            System.out.print("Enter width : ");
            //width value added in the system
            width = sc.nextDouble();
            //prompt user for the height value
            System.out.print("Enter height : ");
            //height value added in the system
            height = sc.nextDouble();
            //process to calculate area of cuboid
            area = (2 * length * width) + (2 * length * height) + (2 * height * width);
            //process to calculate volume of cuboid
            volume = length * height * width;
            System.out.println("Cuboid area : "+new DecimalFormat("0.00").format(area));
            System.out.println("Cuboid volume : "+new DecimalFormat("0.00").format(volume));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in cone.
        else if(shape.equals("cone")){
            System.out.println("\nCONE");
            //prompt user for the radius value
            System.out.print("Enter radius : ");
            radius = sc.nextDouble();
            //prompt user for the height value
            System.out.print("Enter height : ");
            height = sc.nextDouble();
            //process to calculate area of cone
            area = 3.142 * radius * (radius+Math.sqrt((height*height)+(radius*radius)));
            //process to calculate volume of cone
            volume = (3.142 * radius * radius * height) / 3;
            System.out.println("Cone area : "+new DecimalFormat("0.00").format(area));
            System.out.println("Cone volume : "+new DecimalFormat("0.00").format(volume));
            System.out.println("__________________________________________________________________");
        }

        //This section will be executed if user prompt in another object from listed above.
        else{
            System.out.println("SORRY, THIS PROGRAM DOES NOT SUPPORT THE 3D SHAPE ENTERED.");
            System.out.println("PLEASE RE-ENTER THE 3D SHAPE AND CHECK YOUR SPELLING!!");
            System.out.println("__________________________________________________________________");
        }

    }
}
