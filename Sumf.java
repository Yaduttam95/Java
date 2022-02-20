class Sumf{
	//USING FUNCTION
	//define
	static int sum(int a, int b){
		int c;
		c=a+b;
		return c;
	}
	
	public static void main(String args[]){
		int x=5, y=6,z;
		z=sum(x,y); //Function calling
		System.out.println("Sum is "+ z);
	}
}