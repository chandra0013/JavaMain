import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number ");

    int num = sc.nextInt();  
    if(num==0){
        System.out.println("SERIES HAS ONLY ONE ELEMENT THAT IS 0");
    }
    else{
        int first = 0 ; 
        int second = 1;
        System.out.println (first);
        System.out.println (second);
        for (int i=2; i<=num ; i++){
            int sum = first+second ;
            first = second ;
            second = sum; 
            System.out.println (sum); 
            }
        }        
    }   
}