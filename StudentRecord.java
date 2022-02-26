import java.io.Console;
class StudentRecord{
	public static void main(String args[]){
		Console con=System.console();
		System.out.print("Enter roll no.:	");
		int roll=Integer.parseInt(con.readLine());
		System.out.print("Enter Name:	");
		String name=con.readLine();
		
		System.out.println("Roll is " + roll);
		System.out.println("Name is " + name);
	}
}