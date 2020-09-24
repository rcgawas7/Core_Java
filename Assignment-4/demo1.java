class Demo{
    Demo()
    {
     
        System.out.println("This is first call");
    }
   Demo(int i, int j)
   {
       this();
       int sum = i + j;
    System.out.println("sum ="+ sum);

   }

}

class Example extends Demo{

     Example()
     {
         this(4,8);
      System.out.println("This is baseclass  call");
    }
   Example(int i, int j)
   {
       super(6,2); 
       int mul = i * j;
    System.out.println("mul ="+ mul);

   }

}

class demo1{

    public static void main(String args[]){
    
    Example e = new Example();

    }
}