import java.io.Console;
class SumConsoleIo{
	public static void main(String args[]){
		Console con=System.console();
		System.out.print("Enter 1st integer:	");
		int a=Integer.parseInt(con.readLine());
		System.out.print("Enter 2nd integer:	");
		int b=Integer.parseInt(con.readLine());
		int sum=a+b;
		System.out.println("Sum is " + sum);
	}
}