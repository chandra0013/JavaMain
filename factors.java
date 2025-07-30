import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER: ");
        int num = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numbers.add(i);  // Add factors of num
            }
        }

        System.out.println("Factors of " + num + ": " + numbers);
    }
}
