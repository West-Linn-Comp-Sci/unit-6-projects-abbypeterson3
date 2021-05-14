
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2DExplorer
{
    public int minRow(int [][]nums){
        int min = nums[0][0];
        for(int i =0; i <nums.length; i++){
            for(int j =0; j<nums[j].length; j++){
                if (nums[i][j]< min)
                min = nums[i][j];
            }
        }
        return min;
    }
    public int colMax(int[][] matrix){
        int max = matrix[0][0];
        for (int i =0; i<matrix[0].length; i++){
            for(int j =0; j<matrix.length; j++){
                if (matrix[i][j]> max)
                max = matrix[i][j];
            }
        }
        return max;
    }
    
   public int allRowSums(int[][] data){
      int sum = 0;
      for(int i = 0; i<data.length; i++){
        for(int j =0; j<data[0].length; j++){
           sum +=data[i][j]; 
        }
        }
       return sum;
    }
    public double averageCol(int[][]nums){
        int average = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
        for(int j =0; j<nums[0].length; j++){
           sum +=nums[i][j]; 
        }
    }
    average = sum/nums[i].length;
    return average;
}
public int smallEven(int[][]matrix){
    minNum =0;
    for(i=0; i<matrix.length; i++){
       for(j=0; j<matrix[0]; j++){
           if(minNum >matrix[i][j])
           minNum = matrix[i][j];
        }
    }
    return minNum;
}
public int biggestRow(int[][]nums){
    int sum = 0;
    int biggest =0;
      for(int i = 0; i<nums.length; i++){
        for(int j =0; j<nums[0].length; j++){
           sum +=nums[i][j]; 
           if(sum<nums[i][j])
           biggest =nums[i][j];
        }
        }
      return biggest;
}
