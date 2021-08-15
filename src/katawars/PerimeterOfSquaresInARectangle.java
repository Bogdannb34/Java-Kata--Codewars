package katawars;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {

    /*
    The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum
     of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
     */

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
        System.out.println(perimeter(BigInteger.valueOf(7)));
        System.out.println(perimeter(BigInteger.valueOf(30)));
    }

    public static BigInteger perimeter(BigInteger n) {
        int nn = n.intValue();
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(2);
        BigInteger temp_a = null, temp_b = null;
        for (int i = 0; i < nn; i++) {
            temp_a = a;
            temp_b = b;
            b = temp_a.add(temp_b);
            a = temp_b;
        }
        return b.subtract(BigInteger.valueOf(1)).multiply(BigInteger.valueOf(4));
    }
}
