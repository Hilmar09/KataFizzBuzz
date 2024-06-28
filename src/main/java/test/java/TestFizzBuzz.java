package test.java;

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    @Test
    void fizzBuzz_divisible_by_3_and_5() {

        String divisible = Main.execute(15);

        assertEquals("FizzBuzz", divisible);
    }
    @Test
    void fizzBuzz_divisible_by_3() {

        String divisible = Main.execute(9);

        assertEquals("Fizz", divisible);
    }
    @Test
    void fizzBuzz_divisible_by_5() {

        String divisible = Main.execute(50);

        assertEquals("Buzz", divisible);
    }
    @Test
    void fizzBuzz_no_divisible() {

        String divisible = Main.execute(7);

        assertEquals("7", divisible);
    }

}

