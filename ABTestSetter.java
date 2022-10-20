class A{
	private int x;
	
	void setX(int x1){
		x=x1;
	}
	
	void displayx(){
		System.out.println(x);
	}
}
class B extends A{
	private int y;
	
	void setY(int y1){
		y=y1;
	}
	
	void displayy(){
		System.out.println(y);
	}
}

class ABTestSetter{
	public static void main(String args[]){
		B b1=new B();
		b1.setX(5);
		b1.setY(10);
		b1.displayx();
		b1.displayy();
	}
}