
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class minRow
{
 public static void main(String[] args) {


    int[] testArr = {12,32,45,435,-1,345,0,564,-10,234,25};


   findMin(testArr);


 }
   public static int minRow(int[][]arr) {
          int result = minRowAux(arr,arr.length-1,arr.length-1);
   System.out.println(result);
   return result;
 }
 public static int minRowAux(int[] arr, int startIndex, int smallest) {
   if(arr[startIndex]<smallest) {
       smallest = arr[startIndex];
   }
   startIndex--;
   if(startIndex>=0) {
       minRowAux(arr,startIndex,smallest);

   }
   return smallest;

    }
}
