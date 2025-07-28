class Main {
    public static void main(String[] args) {
        // Step 1: Declare the number to check
        int n = 153;  // Example input

        // Step 2: Copy the original number for processing
        int tempN = n;  // We'll use tempN to extract digits, n remains unchanged

        // Step 3: Find how many digits the number has
        int y = (int) Math.log10(n) + 1;  
        // For 153, log10(153) ≈ 2.18 → cast to 2 → 2 + 1 = 3 digits

        // Step 4: Initialize sum variable
        int sum = 0;  // This will store the sum of powered digits

        // Step 5: Loop to process each digit
        while (tempN > 0) {
            int digit = tempN % 10;  
            // Extract last digit, e.g., 153 % 10 = 3

            sum += (int) Math.pow(digit, y);  
            // Raise digit to power of y (number of digits)
            // For digit 3 → 3^3 = 27 → sum += 27

            tempN /= 10;  
            // Remove the last digit, e.g., 153 / 10 = 15 (next loop: digit = 5)
        }

        // Step 6: Compare sum with original number
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
