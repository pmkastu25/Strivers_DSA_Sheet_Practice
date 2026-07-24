
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

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
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
    }
}