import java.util.Scanner;
import java.io.Console;

class Io{
	public static void main(String args[]){
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner("a.txt");
		System.out.println(sc1==sc2);
		
		Console con1=System.console();
		Console con2=System.console();
		System.out.println(con1==con2);
	}
}