/**
 * inverted_half_pyramid
 */
public class inverted_half_pyramid {

    public static void main(String[] args) {
        
        int a = 4; // row also column

        for ( int i=1; i<=a; i++){

            for (int j=0; j<=a-i; j++){

                System.out.print("* ");
            }
            System.out.println();
           
        }
    }
}