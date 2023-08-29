package Area;

import java.util.Scanner;

public class Triangle 
{
    Scanner iste;
    
    void half()
    {
        iste = new Scanner(System.in);

        System.out.println("Enter height for triangle");
        int paap=iste.nextInt();

        System.out.println("Enter Base for the triangle");
        int tiet=iste.nextInt();

        int iit=(paap*tiet);
        int nit=(iit/2);

        System.out.println("Area of your triangle is "+nit);
    }
}
