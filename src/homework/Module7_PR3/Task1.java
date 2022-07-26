package homework.Module7_PR3;

/*Get all special values for types float and double executing wrong operations.
* Try to compare values using these operations:
* -Infinity < -0.0 = 0.0 < Infinity*/

public class Task1 {
    public static void main(String[] args) {
        float infinityFloat = 1f/0f;
        float negativeInfinityFloat = -1f/0f;
        float negativeZeroFloat = -1f/infinityFloat;
        float nanFloat = 0f/0f;
        System.out.println("Float special values:\n" + infinityFloat + "\n" + negativeInfinityFloat + "\n" + negativeZeroFloat + "\n" + nanFloat);

        System.out.println();
        double infinity = 1d/0d;
        double negativeInfinity = -1d/0d;
        double negativeZero = -1d/infinity;
        double nan = 0d/0d;
        System.out.println("Double special values:\n" + infinity + "\n" + negativeInfinity + "\n" + negativeZero + "\n" + nan);


        System.out.println("Float: ");
        System.out.println(negativeInfinityFloat < negativeZeroFloat == 0.0 < infinityFloat);
        System.out.println("Double: ");
        System.out.println(negativeInfinity < negativeZero == 0.0 < infinity);


    }
}
