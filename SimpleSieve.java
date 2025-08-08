import java.util.Scanner;
public class Main{
    static void simplesieve(int n){
        boolean hala[]=new boolean[n+1];
        for(int i=0;i<=n;i++){
            hala[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(hala[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    hala[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(hala[i]==true)
            System.out.println("Prime numbers are "+i);
        }
    }
    public static void main(String[] args){
        int n=30;
        simplesieve(n);
    }
}
