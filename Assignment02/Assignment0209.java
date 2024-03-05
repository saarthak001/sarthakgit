public class Assignment0209 {
    public static void main(String[] args){
        int n = 10;  

        if (n <= 0){
            System.out.println("Please enter a positive integer");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
}
