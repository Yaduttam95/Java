import java.io.Console;
class Password{
	public static void main(String args[]){
		Console con=System.console();
		System.out.print("Enter Password:	");
		String pass=new String(con.readPassword());
		
		System.out.println("Password is " + pass);
	}
}