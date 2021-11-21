package Week4;

public class GenerateException {

    public static void generateException(String exceptionType) {
        switch (exceptionType) {
            case "arithmetic":
                throw new ArithmeticException();
            case "index":
                throw new IndexOutOfBoundsException();
            case "null":
                throw new NullPointerException();
            default:
                break;
        }
    }
}
