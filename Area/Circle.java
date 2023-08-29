package Area;

import java.util.Scanner;

public class Circle 
{
    Scanner sad;

    void radius()
    {
        sad = new Scanner(System.in);
        

        System.out.println("Enter radius of circle");
        double ra=sad.nextDouble();

        double pie=3.14;

        double rr=(ra*ra);
        double ar=(rr*pie);
        
        System.out.println("Area of circle is :"+ar);

                        
    }    
}
