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

    public static void generateExceptionUsingIf(String exceptionType) {
        if (exceptionType.equals("arithmetic")) {
            throw new ArithmeticException();
        } else if (exceptionType.equals("index")) {
            throw new IndexOutOfBoundsException();
        } else if (exceptionType.equals("null")) {
            throw new NullPointerException();
        } else {

        }
    }
}
