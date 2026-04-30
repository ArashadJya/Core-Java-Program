// Step 1: Create your custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Step 2: Use the custom exception in code
   class Tests {
    public static void main(String[] args) {
        try {
            checkAge(155);
        } catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be at least 18");
        }
        System.out.println("You are eligible");
    }
}

