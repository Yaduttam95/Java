class Convert{
	public static void main(String abc[]){
		//Decimal to Binary
		System.out.println(Integer.toBinaryString(25));//11001
		//Decimal to octal
		System.out.println(Integer.toOctalString(25)); //31
		//Decimal to Hex
		System.out.println(Integer.toHexstring (26));//1A
		//Binary to Decimal
		System.out.println(0b11001); //25
		//octal to Decimal
		System.out.println(031);//25
		//Hex to Decimal
		System.out.println(0x1a); //26
		//Hex to octal
		System.out.println(Integer.toOctalString(0x19));//31
	}
}