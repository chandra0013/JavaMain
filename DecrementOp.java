public class Dec {
    public static void main(String[] args) {
        int a = 1;
        int b = a--;   // Postfix increment
        int c = --a;   // Prefix increment

        System.out.println("b: " + b); // 1
        System.out.println("a: " + a); // -1
        System.out.println("c: " + c); // -1
    }
}
