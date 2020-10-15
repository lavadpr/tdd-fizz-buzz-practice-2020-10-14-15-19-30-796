package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    void fizzBuzzWhizzTest(int orderNumber, String output){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals(output, actual);
    }
    @Test
    void should_return_1_when_count_off_given_order_number_1(){
        fizzBuzzWhizzTest(1, "1");
    }
    @Test
    void should_return_fizz_when_count_off_given_order_number_3(){
        fizzBuzzWhizzTest(3, "Fizz");
    }
    @Test
    void should_return_buzz_when_count_off_given_order_number_5(){
        fizzBuzzWhizzTest(5, "Buzz");
    }
    @Test
    void should_return_fizzbuzz_when_count_off_given_order_number_15(){
        fizzBuzzWhizzTest(15, "FizzBuzz");
    }
    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_order_number_105(){
        fizzBuzzWhizzTest(105, "FizzBuzzWhizz");
    }
    @Test
    void should_return_buzzwhizz_when_count_off_given_order_number_35(){
        fizzBuzzWhizzTest(35, "BuzzWhizz");
    }
    @Test
    void should_return_fizzwhizz_when_count_off_given_order_number_21(){
        fizzBuzzWhizzTest(21, "FizzWhizz");
    }
    @Test
    void should_return_whizz_when_count_off_given_order_number_7(){
        fizzBuzzWhizzTest(7, "Whizz");
    }

}
