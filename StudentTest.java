import java.io.Console;
class Student{
    private int roll;
    private String name;
    private int sub1,sub2;
    private float per;
    void setData(int r,String n, int a,int b){
         roll=r;
         name=n;
         sub1=a;
         sub2=b;
    }
    void getData(){
         Console con=System.console();
         System.out.print("Enter roll:");
         roll=Integer.parseInt (con.readLine ());
         System.out.print("Enter name: ");
         name=con.readLine();
         System.out.print("Enter marks of subl:");
         sub1=Integer.parseInt (con.readLine ());
         System.out.print("Enter marks of sub2:");
         sub2=Integer.parseInt (con.readLine ());
    }
    void calc_per(){
         per=(sub1+sub2)/2.0f;
    }
    void display(){
         System.out.println(roll+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+per+"%");
    }
}
class StudentTest1{
    public static void main(String args []){
        Student s1=new Student();
        Student s2=new Student();
        //s1.setData(101,"Ajay",70,80);
        //s2.setData(102,"vijay",80,90);
        //or
        s1.getData();
        s2.getData ();
        s1.calc_per();
        s2.calc_per();
        System.out.println("Roll\tName\tsub1\tsub2\tPer");
        s1.display();
        s2.display();
    }
}
class studentTest2{
    public static void main(String args []){
        Console con=System.console ();
        System.out.print("Enter how many students:");
        int n=Integer.parseInt (con.readLine ());
        Student s[]=new Student [n];//Array of references not objects
        for(int i=0;i<n;i++){
            s[i]=new Student();//Now object created
             s[i].getData();
            s[i].calc_per();
        }
        System.out.println("Roll\tName\tsub1\tsub2\tPer");
        for (int i=0;i<n;i++){
            s[i].display();
        }
	}
}