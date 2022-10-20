class A{
	private int x;
	
	void setx(int x1){
		x=x1;
	}
	
	void displayx(){
		System.out.println(x);
	}
}
class B extends A{
	private int y;
	
	void setxy(int x1, int y1){
		setx(x1);
		y=y1;
	}
	
	void displayxy(){
		displayx();
		System.out.println(y);
	}
}

class ABTestSetterxy{
	public static void main(String args[]){
		B b1=new B();
		b1.setxy(5,10);
		b1.displayxy();
	}
}