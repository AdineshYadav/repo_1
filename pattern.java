public class pattern {
    public static void main(String[] args) {

        //ASSIGNMENT 1

        //QUESTION 1
          int  n = 11;

          // Printing "I"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0  || j == n/2 || i == n-1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //Printing "N"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j  || j == 0 || j == n-1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //Printing "E"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || i == n/2 || i == n-1 || j == 0  ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //Printing "U"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == n-1  || j == 0 || j == n-1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //Printing "R"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || i == n/2 || j == 0 || (j == n-1 && i <= n/2) || (i == j && i >= n/2) ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //Printing "O"
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || i == n-1  || j == 0 || j == n-1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == j  || j == 0 || j == n-1 ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        System.out.println();

        //QUESTION 2
        for(int i = 1 ; i < 5 ; i++){
            for(int j = 1 ; j < 5 ; j++){
                System.out.print(i);

            }
            System.out.println();
        }
    }
}
