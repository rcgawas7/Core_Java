class Student{

       int rollno;
        String name;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
            }
}

class StudentDemo {
        public static void main(String args[]){
        
        Student s = new Student();

        s.setData(101,"Omkar");
        s.showData();
        s.setData(102,"Akshay");
        s.showData();
        
        }

}
