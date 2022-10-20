class A{
	int x;
}
class B extends A{
	int y;
}

class ABTest{
	public static void main(String args[]){
		B b1=new B();
		b1.x=5;
		b1.y=7;
		System.out.println(b1.x + "," + b1.y);
	}
}