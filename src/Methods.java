public class Methods {

    // method without parameter
    // method declaration
//    static void printTable(){
//        for (int i = 1; i <= 10; i++){
//            int ans = 2 * i;
//            System.out.println("Tbale: " + ans);
//        }
//    }

    // method with parameter
//   static void printSum(int a, int b){
//        System.out.println(a+b);
//    }

    // return method
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    static void main() {
        // method call
//        printTable();

//        printSum(10,20);


        int result = add(24,32);
        System.out.println("Result is: "+ result);
    }
}
