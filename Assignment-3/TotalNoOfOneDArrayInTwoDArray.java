class TotalNoOfOneDArrayInTwoDArray{

    public static void main(String args[]){

        int a[]= {9,8,7};
        int a1[]= {6,5,4};
        int a3[]= {3,2,1};

        int arr[][]= new int[3][];
        arr[0]=a;
        arr[1]=a1;
        arr[2]=a3;
      
        System.out.println("Total element of one-D =");
        for ( int i=0; i< arr.length; i++)
        {
            for( int j=0; j< arr[i].length; j++)
            System.out.print(" "+ arr[i][j]);
        }
           
    }
}
