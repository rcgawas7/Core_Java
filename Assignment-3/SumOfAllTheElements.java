public class SumOfAllTheElements
{
   public static void main(String[] args)
   {
    
      int[][] values =
      { 
     {1,2,3,4}, {5,6,7,8}, {9,1,2,3}, {4,5,6,7}, {8,9,1,2} 
      };
         int sum =0;
     
      for (int row = 0; row < 5; row++)
      {
         for (int col = 0; col < 4; col++)
         {
            System.out.print(values[row][col] + " ");

            sum = sum + values[row][col];
         }

         System.out.println();   
      }
               System.out.print("array sum = "+sum);

   }
}