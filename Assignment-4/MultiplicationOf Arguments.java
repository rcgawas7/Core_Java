class MathOpe{

 static void multiply(int a, int b)
{

    int mul = a + b;
    System.out.println("multiplication = "+ mul);
}

static void multiply(float a, float b, float c)
{
    
    float mul = a * b * c;
    System.out.println("multiplication = "+ mul);

}
static void multiply(int arr[])
{
    int mul = 1;

    for( int e : arr)
    {
         mul = mul * e;
    }
     System.out.println("multiplication = "+ mul);

}
static void multiply(double a, int b)
{

    double mul = a * b;
  System.out.println("multiplication = "+ mul);

}
}
class MultiplicationOfArguments{

    public static void main(String args[]){

      MathOpe.multiply(3, 9);
      MathOpe.multiply(3.9f, 5.8f, 0.5f);
       int array[] = {3, 9, 5, 8, 6};
      MathOpe.multiply(array);
      MathOpe.multiply(11.6, 8);
    }
}