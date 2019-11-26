package oop_concepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

import java.io.IOException;

public class ExceptionWithLucian {
    // setting the awareness of the logger: trace < debug < info < warn < error
    static {
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "ERROR");
    }
    // accessing logger from maven
    public static final Logger LOGGER = LoggerFactory.getLogger(ExceptionWithLucian.class);

    public static void main(String[] args) {
        // try-catch-catch-...-catch-finally
        try {
            LOGGER.trace("---logger test trace---");
            LOGGER.debug("---logger test debug---");
            LOGGER.info("---logger test info---");
            LOGGER.warn("---logger test warn---");
            LOGGER.error("---logger test error---");

            // test exception
/*            if (true) {
            throw new RuntimeException("Hahaha!");
            }*/

            System.out.println("" + testDivision(5, 2));
            System.out.println(testDivision(5, 1));
            System.out.println(testSubtraction(6, 4));
            System.out.println(testSubtraction(2, 4));
        } catch (IOException | NullPointerException e) {
            LOGGER.error("IOException treated. " + e.getMessage());
        } catch (ArithmeticException e) {
            LOGGER.error("Exception treated. {}", e.getMessage(), e);
            // see what i did there? print what's between {} after comma.
            // not working with System.out.println...
        } finally {
            System.out.println("All good - or not. Finally gets executed anyway.");
            // finally always gets executed even if exception is not thrown
            // is not necessary
            // can be used without catch
        }

        // piece of code executed only if all exceptions are caught
        System.out.println("The execution of program continues if all exceptions are caught and handled. If not program is stopped.");
    }

    // division function. throws exception if division is by zero
    public static int testDivision(int nominator, int denominator) throws IOException {
/*        if (denominator == 0) {
            throw new IOException("Division by zero.");
        }*/
        // it works, but compiles the if denominator == 0 expression every time, not performance oriented

        // below: does not perform the denominator == 0 check, tries anyway and throws exception only when expression has a problem
        try {
            return nominator / denominator;
        } catch(ArithmeticException e) {
            throw new IOException(e);
        }
    }

    // subtraction function. throws exception if result is negative
    public static int testSubtraction(int first, int second) throws MyException {
        if (first < second) {
            throw new MyException("Negative value.");
            // if exception is thrown exits the method, no return statement needed
        }
        else {
            return first - second;
        }
    }

    // new MyException class
    public static class MyException extends ArithmeticException {
        public MyException (String message) {
            super(message);
        }
    }
}
