import java.lang.*;

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

class Implement {
    static void check(int age) throws InvalidAge {
        if (age <= 0)
            throw new InvalidAge("The age is invalid");
        else
            System.out.println("The age is valid");
    }
}

public class TestException {
    public static void main(String[] args) throws InvalidAge {
        try {
            Implement.check(0); // invalid
        } catch (InvalidAge e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues... after the try and an arithmetic block is thrown");
        throw new InvalidAge("ghk");
    }
}
