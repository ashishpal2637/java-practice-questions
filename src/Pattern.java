public class Pattern {

    static void main() {

//        int n = 4;
//
//        for(int row = 1; row <= n; row++){
//            // for each row -> n column
//            for(int col = 1; col <= n; col++){
//                // print star
//                System.out.print("* ");
//            }
//            // move to next line or row
//            System.out.println();
//        }



//        int n = 3;
//
//        for(int row = 1; row <= n; row++){
//            // for each row -> 5 columns
//            for(int col = 1; col <= 5; col++){
//                // print star in every column
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }


//        int n = 5;
//
//        for(int row = 1; row <= n; row++){
//            // for each row -> variable column
//            // formula -> col -> 1 to value of row
//            for(int col = 1; col <= row; col++){
//                // print star
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }


//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            // for each row -> variable column print spaces and print star
//            // formula
//            // spaces -> n - row
//            for(int col = 1; col <= n - row; col++){
//                System.out.print(" ");
//            }
//            // star -> col <= n
//            for(int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            // for each row -> variable column
//            // formula -> n - row + 1
//            for(int col = 1; col <= n - row + 1; col++){
//                // print star
//                System.out.print("* ");
//            }
//            // move to next row
//            System.out.println();
//        }

        int n = 5;
        for(int row = 1; row <= n; row++){
            // for each row -> variable column
            // spaces
            for(int col = 1; col <= n - row; col++){
                System.out.print("  ");
            }
            // stars
            for(int col = 1; col <= 2 * row - 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
