package Area;

import java.util.Scanner;

public class Shapecalc 
{
    static Scanner bjp;
    
    void circle()
    {
        Circle ccs = new Circle();
        ccs.radius();
    }
    void rectangle()
    {
        Length lead = new Length();
        lead.mul();
    }
    void side()
    {
        Triangle gfti = new Triangle();
        gfti.half();
    }
    public static void main(String[] args) 
    {
        Shapecalc aap = new Shapecalc();
        bjp = new Scanner(System.in);
        String str;
        do
        {
            System.out.println("Which shape area you want to calculate? \n1.Circle \n2.Rectangle \n3.Triangle");
            
            String input = bjp.next();

            switch(input)
            {
                case "circle": aap.circle();
                break;

                case "rectangle": aap.rectangle();
                break;

                case "triangle": aap.side();
                break;

                default:System.out.println("invalid input");
                break;
            }
            System.out.println("Do you want to continue, if yes then press y otherwise any key");
            str = bjp.next();
        }while(str.equals("y"));
    }
}