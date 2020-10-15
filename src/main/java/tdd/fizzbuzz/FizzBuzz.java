package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";
    private final int FIZZ_MODULO = 3;
    private final int BUZZ_MODULO = 5;
    private final int WHIZZ_MODULO = 7;

    public String countOff(int orderNumber) {
        String output = "";
        output = getOutputOnCount(orderNumber, output, FIZZ_MODULO, FIZZ);
        output = getOutputOnCount(orderNumber, output, BUZZ_MODULO, BUZZ);
        output = getOutputOnCount(orderNumber, output, WHIZZ_MODULO, WHIZZ);
        return output.equals("") ? String.valueOf(orderNumber) : output;
    }
    private String getOutputOnCount(int orderNumber, String output, int modulo, String concat) {
        if (orderNumber % modulo == 0) {
            return output += concat;
        }
        return output;
    }
}
