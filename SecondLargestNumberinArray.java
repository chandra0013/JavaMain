import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print n value");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int temp1=arr[0];
        int temp2=arr[1];
        int temp3=0;
        for(int lol=2;lol<num;lol++){
            while(temp1<temp2){
                temp1=temp3;
                temp2=temp1;
                temp3=temp2;
            }
            if(arr[lol]>temp1){
                temp2=temp1;
                temp1=arr[lol];
            }
            else if(arr[lol]==temp1){
                temp2=arr[lol];
            }
            else if(arr[lol]<=temp1 & arr[lol]>temp2){
                temp2=arr[lol];
            }
            else{
                continue;
            }
        }
        System.out.println("Second Largest number of array "+temp2);
    }
}
