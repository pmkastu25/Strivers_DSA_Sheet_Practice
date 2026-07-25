
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
    

    public static void main(String[] args){
        System.out.println("-----------------------------SQUARE------------------------------");
        square();
        System.out.println("--------------------------HALF PYRAMID--------------------------");
        halfPyramid();
        System.out.println("--------------------------Number HALF PYRAMID--------------------------");
        halfPyramidNum();
        System.out.println("--------------------------Number HALF PYRAMID Variation--------------------------");
        halfPyramidNum1();
        System.out.println("--------------------------inverted HALF PYRAMID--------------------------");
        invertedHalfPyramid();
        System.out.println("--------------------------inverted HALF PYRAMID variation--------------------------");
        invertedHalfPyramid1();
        System.out.println("--------------------------HALF PYRAMID 2--------------------------");
        halfPyramid2();
        System.out.println("--------------------------HALF PYRAMID INVERTED 2--------------------------");
        halfPyramidInverted2();
        System.out.println("--------------------------FULL PYRAMID--------------------------");
        halfPyramid2();
        halfPyramidInverted2();
    }
}