import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Print numbers");
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
		    num[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=n-1;i>0;i--){
		    for(int j=0;j<n-1;j++){
		        if(num[j]>num[j+1]){
		            temp=num[j];
		            num[j]=num[j+1];
		            num[j+1]=temp;
		            
		        }
		    }
		}
		for(int i=0;i<=n-1;i++){
		    System.out.println("Numbers in array: "+num[i]);
		}
		
	}
}
