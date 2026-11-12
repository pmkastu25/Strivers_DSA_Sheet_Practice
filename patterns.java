
class patterns{
    public static void square(){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(){
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidNum(){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void halfPyramidNum1(){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(){
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid1(){
        int n = 5;

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void halfPyramid2(){
        int n=5;
        for(int i=0; i<n; i++){
                for(int spaces=0; spaces<n-i-1; spaces++){
                    System.out.print(" ");
                }

                for(int stars=0; stars<(2*i+1); stars++){
                    System.out.print("*");
                }

                for(int spaces=0; spaces<n-i-1; spaces++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

     public static void halfPyramidInverted2(){
        int n=5;
        for(int i=0; i<n; i++){
                for(int spaces=0; spaces<i; spaces++){
                    System.out.print(" ");
                }

                for(int stars=0; stars<2*n-(2*i+1); stars++){
                    System.out.print("*");
                }

                for(int spaces=0; spaces<i; spaces++){
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
    
    public static void BinaryTriangle(int n){
        for(int i=0; i<=2*n-1; i++){
            int stars = (i > n ? 2*n-i : i);
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NumberCrown(int n){
        for(int i=0; i<n; i++){
            int start = (i % 2 == 0 ? 1: 0); //if even row start=1 else 0;

            for(int j=0; j<=i; j++){
                System.out.print(start); //print start first then toggle
                start = 1 - start; //toggle start
            }
            System.out.println();
        }
    }

    public static void ConsecutiveNumberTriangle(int n){
        for(int i=1; i<=n; i++){
            //Number
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            //Spaces
            for(int j=1; j<=(2*n-2*i); j++){
                System.out.print(" ");
            }
             //Number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void halfNumberTriangle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void RowCharacterTriangle(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void invertedRowCharacterTriangle(int n){
        for(int i=n; i>=1; i--){
            char ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("-----------------------------1. SQUARE------------------------------");
        square();
        System.out.println("--------------------------2. HALF PYRAMID--------------------------");
        halfPyramid();
        System.out.println("--------------------------3. Number HALF PYRAMID--------------------------");
        halfPyramidNum();
        System.out.println("--------------------------4. Number HALF PYRAMID Variation--------------------------");
        halfPyramidNum1();
        System.out.println("--------------------------5. inverted HALF PYRAMID--------------------------");
        invertedHalfPyramid();
        System.out.println("--------------------------6. inverted HALF PYRAMID variation--------------------------");
        invertedHalfPyramid1();
        System.out.println("--------------------------7. HALF PYRAMID 2--------------------------");
        halfPyramid2();
        System.out.println("--------------------------8. HALF PYRAMID INVERTED 2--------------------------");
        halfPyramidInverted2();
        System.out.println("--------------------------9. FULL PYRAMID--------------------------");
        halfPyramid2();
        halfPyramidInverted2();
        System.out.println("--------------------------10. BINARY TRIANGLE--------------------------");
        BinaryTriangle(5);
        System.out.println("--------------------------11. NUMBER CROWN--------------------------");
        NumberCrown(5);
        System.out.println("--------------------------12. Consecutive Number Triangle--------------------------");
        ConsecutiveNumberTriangle(4);
        System.out.println("--------------------------13. Half Number Triangle--------------------------");
        halfNumberTriangle(5);
        System.out.println("--------------------------14. Row Character Triangle--------------------------");
        RowCharacterTriangle(5);
        System.out.println("--------------------------15. Inverted Row Character Triangle--------------------------");
        invertedRowCharacterTriangle(5);
    }
}