/*Swap two numbers using third variable*/
class Swap{

    public static void main(String[] args) {
        int a=5, b=4, t;
        System.out.println("Before Swapping value of a is "+a);
        System.out.println("Before Swapping value of b is "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After Swapping value of a is "+ a);
        System.out.println("After Swapping value of b is "+ b);
        System.out.println("After Swapping values are "+ a + ", " + b + ".");
    }
}
