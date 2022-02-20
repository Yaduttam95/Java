class Swapf{
	//USING FUNCTION
	//define
	static void swap(int a, int b){
		int t=a;a=b;b=t;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	
	public static void main(String args[]){
		swap(5,6);
	}
}