import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int inpInteger = scan.nextInt();
        double inpDouble = scan.nextDouble();
        scan.nextLine();
        String string = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + string);
        System.out.println("Double: " + inpDouble);
        System.out.println("Int: " + inpInteger);
    }
}