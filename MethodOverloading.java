class MethodOverloading{
	int sum(int a, int b){
		return a+b;
	}
	
	int sum(int a, int b, int c){
		return a+b+c;
	}
	
	int sum(int a, int b, int c, int d){
		return a+b+c+d;
	}
	
	public static void main(String args[]){
		MethodOverloading m1=new MethodOverloading();
		System.out.println("Sum is " + m1.sum(5,6));
		System.out.println("Sum is " + m1.sum(5,6,7));
		System.out.println("Sum is " + m1.sum(5,6,7,8));
	}
}