package Area;

import java.util.Scanner;

public class Length 
{
    Scanner ssp;
    
    void mul()
    {
        ssp = new Scanner(System.in);

        System.out.println("Enter length of rectangle");

        int acm=ssp.nextInt();

        System.out.println("Enter breath of rectangle");

        int wasp=ssp.nextInt();

        if(acm==wasp)
        {
            System.out.println("Area of square is "+(acm*wasp));
        }
        else
        {
            System.out.println("Area of rectangle is "+(acm*wasp));
        }
    }
}
