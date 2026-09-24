import java.util.Scanner;

public class BasicQuestion {

        public static void main(String[] args){

            // find Odd Even
            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//
//        if(n%2 == 0){
//            System.out.println("Even");
//        } else{
//            System.out.println("Odd");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//        System.out.println("Enter third number");
//        int c = sc.nextInt();
//

            // Greates of three number
//        if(a >= b && a >= c){
//            System.out.println("First number is greater than second and third: " + a);
//        } else if(b >= a && b >= c){
//            System.out.println("Second number is greater than first and third: " + b);
//        } else{
//            System.out.println("Third number is greater than first and second: " + c);
//        }


            // Sum of digits
//        System.out.println("Enter the digit to find of sum:");
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n > 0){
//            int digit = n % 10;
//            sum += digit;
//            n = n / 10;
//        }
//        System.out.println("Sum of your digit: " + sum);


            // Reverse number
//        System.out.println("Enter the number:");
//        int n = sc.nextInt();
//        int reversed = 0;
//        while(n > 0){
//            int rem = n % 10;
//            reversed = reversed * 10 + rem;
//            n = n / 10;
//        }
//        System.out.println(reversed);


            // Palindrome number
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int original = n;
//        int rev = 0;
//        while(n > 0){
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n = n / 10;
//        }
//        if (original == rev){
//            System.out.println("The number is palindrome:");
//        } else {
//            System.out.println("The number is not palindrome:");
//        }


            // Digit count
//        System.out.println("Enter digit");
//        int n = sc.nextInt();
//        int count = 0;
//        if(n == 0){
//            count = 1;
//        }
//        while(n > 0){
//            n = n / 10;
//            count++;
//        }
//        System.out.println(count);


            // sum of even digits
//        System.out.println("Enter the digits");
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n > 0){
//            int digit = n % 10;
//            if(digit%2 == 0){
//                sum += digit;
//            }
//            n = n /10;
//        }
//        System.out.println(sum);


            // count even and odd digit
            System.out.println("Enter the digits");
            int n = sc.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            if (n == 0){
                evenCount = 1;
            }
            while(n > 0){
                int digit = n % 10;
                if(digit % 2 == 0){
                    evenCount++;
                } else{
                    oddCount++;
                }
                n /= 10;
            }
            System.out.println("Number of even digit: " + evenCount);
            System.out.println("Number of odd digit: " + oddCount);
        }
}

