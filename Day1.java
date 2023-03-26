import java.util.*;
import java.math.*;
public class name {

    public static void  main(String args[]) {       
System.out.println("Hey!!!welcome to Chaitra challenge\nwith the following program you will be able to calculate volume of sphere and cylinder");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of SPHERE:-");
          float radius=sc.nextInt();
          Double volume_of_sphere=(4.0/3.0)*(Math.PI)*(radius*radius*radius);
        System.out.printf(("volume of Sphere is:-"+volume_of_sphere));


        float r=sc.nextFloat();
        float h=sc.nextFloat();
      
        System.out.println("Enter the Radius and Height of cylinder"+"radius"+r+"\n"+"Height"+h+"\n");
       
        Double volume_of_cylinder=(Math.PI)*(r*r)*(h);
        System.out.println("Volume of Cylinder is:-"+volume_of_cylinder);
    }
}



//output
/*
Hey!!!welcome to Chaitra challenge
with the following program you will be able to calculate volume of sphere and cylinder
Enter the radius of SPHERE:-
5
volume of Sphere is:-523.5987755982989

3
5
Enter the Radius and Height of cylinderradius3.0
Height5.0

Volume of Cylinder is:-141.3716694115407

Process finished with exit code 0
*/
