package Prac4;

import java.io.FileNotFoundException;
import java.util.Random;

public class PracticalFour {

    private static void makeException(ExceptionEnum type)
            throws FileNotFoundException, UnknownException {
//        if (type == ExceptionEnum.NULL) {
//            throw new NullPointerException();
//        } else if (type == ExceptionEnum.BOUNDS) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else if (type == ExceptionEnum.NONE) {
//
//        } else if (type == ExceptionEnum.MISSING) {
//            throw new FileNotFoundException();
//        } else if (type == ExceptionEnum.UNKNOWN) {
//            throw new UnknownException();
//        }

        // Or use switch statements (more preferable)
        switch (type) {
            case NULL:
                throw new NullPointerException();   // no return statement, so no need "break"
            case BOUNDS:
                throw new ArrayIndexOutOfBoundsException();
            case NONE:
                System.out.println("No problems");  // not returning or throwing, so need "break"
                break;
            case MISSING:
                throw new FileNotFoundException();
            case UNKNOWN:
                throw new UnknownException();
            // No default statement is because value of variables can only be that 5 variables
        }
    }

    private static void f() {
        try {
            makeException(ExceptionEnum.NULL);
        } catch (NullPointerException e) {
            // do nothing
        } catch (FileNotFoundException | UnknownException e) {
            // do nothing
            // this code is unreachable
            // only to make compiler happy
        }

        try {
            makeException(ExceptionEnum.NONE);
            makeException(ExceptionEnum.MISSING);
            makeException(ExceptionEnum.NONE);
        } catch (Exception e) {
            System.out.println(e);
            // e.printStackTrace(); gives out more details
        }
    }

    private static void g(Random random)
            throws FileNotFoundException, UnknownException {
        int x = random.nextInt(ExceptionEnum.values().length);
        int y = random.nextInt(ExceptionEnum.values().length);

        try {
            makeException(ExceptionEnum.values()[x]);
            System.out.println("x = " + x);
            makeException(ExceptionEnum.values()[y]);
            System.out.println("y = " + y);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    private static void h(Random random) throws UnknownException {
        try {
            g(random);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally { // always execute
            System.out.println("Reached here!");
        }
    }

    public static void main(String[] args) {
        f();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                h(random);  // h() only throw UnknownException
            } catch (UnknownException e) {  // Only catch exception will also catch runtime exceptions
                System.out.println(e);
            }
        }
    }

    // Question 1.5:

//    Advantage on using print statement to debug:
//        1. Easy to tell where we are in the code
//        2. Easy to do testing in this way
//    Drawbacks:
//        1. Quite messy to print out everything
//        2. Don't know what cause this error
//        3. inflexible can only print out string to console
//    Approaches we can use for debugging:
//        1. JUnit test
//        2. Exception breakpoint, using the debugger
}
