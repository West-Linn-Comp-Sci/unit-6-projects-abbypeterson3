
/**
 * The object and reason for this program is to have a user input as many integer values
 * as they wants and the program will track the numbers inputed and the amount of times each
 * number was imputed by the user, creating a chart at the end of the program.
 *
 * Abby Peterson
 * DUE: April 30th
 */
import java.util.Scanner;
public class numCounter
{
      public static void main(String[]args)
    {
          {
                  int x = 1 ;
            int[] count = new int[10];
            Scanner first = new Scanner(System.in);
            System.out.println("Please enter numbers between 1 and 100 and then once you are finished type 111 to create your frequency chart");
             while( x < 1000) { 
            
              int response = first.nextInt();
              int num = response;
             if (num >= 1 && num <= 10)
                count[0]++;
             if (num >= 11 && num <= 20)
               count[1]++;
             if (num >= 21 && num <= 30)
               count[2]++;
             if (num >= 31 && num <= 40)
               count[3]++;
             if (num >= 41 && num <= 50)
               count[4]++;
             if (num >= 51 && num <= 60)
               count[5]++;
             if (num >= 61 && num <= 70)
               count[6]++;
             if (num >= 71 && num <= 80)
               count[7]++;
            if (num >= 81 && num <= 90)
               count[8]++;
             if (num >= 91 && num <= 100)
               count[9]++;
             if (num<=0 || num>100)
               System.out.println("INVALID #: Please enter a number between 1 and 100!");
             if (num == 111)
               x+=1000;
          }
            System.out.println("1-10: "+count[0]+ " times");
            System.out.println("11-20: "+count[1]+ " times");
            System.out.println("21-30: "+count[2]+ " times");
            System.out.println("31-40: "+count[3]+ " times");
            System.out.println("41-50: "+count[4]+ " times");
            System.out.println("51-60: "+count[5]+ " times");
            System.out.println("61-70: "+count[6]+ " times");
            System.out.println("71-80: "+count[7]+ " times");
            System.out.println("81-90: "+count[8]+ " times");
            System.out.println("91-100: "+count[9]+ " times");
          }
}
}