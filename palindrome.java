import java.util.Scanner;

class Palindrome{
    public static boolean isPalindrome(String s){
            int size = s.length();
            for(int i = 0; i < size/2; i++){
                if(s.charAt(i) != s.charAt(size-i-1)){
                    return false;
                }
            }

            return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        if(isPalindrome(s)){
            System.out.println(s + " is a palindrome String");
        }else {
            System.out.println(s + " is Not a palindrome String");
        }
    }
}