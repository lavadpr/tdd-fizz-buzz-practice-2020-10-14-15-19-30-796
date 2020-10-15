package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {
        String output = "";
        if(orderNumber%3==0)
            output += "Fizz";
        if(orderNumber%5==0)
            output += "Buzz";
        if(orderNumber%7==0)
            return "Whizz";
        return output.equals("") ? String.valueOf(orderNumber): output;
    }
}
