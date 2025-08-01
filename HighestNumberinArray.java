import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array");
        int num=sc.nextInt();
        int[] hali=new int[num];
        for(int i=0;i<num;i++){
            hali[i]=sc.nextInt();
        }
        int temp=0;
        for(int j=0;j<num;j++){
            if(temp<hali[j]){
                temp=hali[j];
            }
            else{
                continue;
            }
        }
        System.out.println("Highest number of array is "+ temp);
    }
}
