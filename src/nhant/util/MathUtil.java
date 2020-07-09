package nhant.util;

// class chua cac ham tien ich ho tro phep tinh toan
// vi may la tien ich ham dung chung cho moi noi dung static
public class MathUtil {
    // long co 15!
    public static long computeFactorial(int input) {
        long result = 1;
        for (int i = 1; i <= input; i++) {
            result *= ((long) i);
        }
        return result;
    }

}
