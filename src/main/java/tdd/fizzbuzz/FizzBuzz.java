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
        if(orderNumber%FIZZ_MODULO==0)
            output += FIZZ;
        if(orderNumber%BUZZ_MODULO==0)
            output += BUZZ;
        if(orderNumber%WHIZZ_MODULO==0)
            return WHIZZ;
        return output.equals("") ? String.valueOf(orderNumber): output;
    }
}
