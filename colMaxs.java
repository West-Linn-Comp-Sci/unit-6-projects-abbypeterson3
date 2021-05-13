
/**
 * Write a description of class MyArray2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class colMaxs
{
   public static int max1(int[][] score) {
   int max = score[0][0]; 
   for (int i = 0; i < score.length; i++) { 
       for (int j = 0; j < score[i].length; j++) { 
           if (score[i][j] > max) { 
               max = score[i][j]; 
           }
       }
   } return max;
 }
}



