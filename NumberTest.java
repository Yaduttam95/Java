import java.util.Scanner;
class Number{
	private int x,y;
	
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of x:	");
		x=sc.nextInt();
		System.out.print("Enter value of y:	");
		y=sc.nextInt();
	}
	
	void setData(int x1, int y1){
		x=x1;
		y=y1;
	}
	
	void swap(){
		int t;
		t=x;x=y;y=t;
	}
	
	void display(){
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}

class NumberTest{
	public static void main(String args[]){
		/*Number n1=new Number();
		n1.setData(5,6);
		System.out.println("values before swap!");
		n1.display();
		System.out.println("values after swap!");
		n1.swap();
		n1.display();*/
		
		Number n2=new Number();
		n2.getData();
		System.out.println("values before swap!");
		n2.display();
		System.out.println("values after swap!");
		n2.swap();
		n2.display();
		
	}
}