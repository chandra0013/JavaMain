import java.util.Scanner;

public class Main{
    public static int hello(int a,int b){
        if(a==0){
            return b;
        }
        return hello(b%a,a);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integers: ");
        int ai=sc.nextInt();
        int bi=sc.nextInt();
        System.out.println("gcd is "+hello(ai,bi));
    }
}
