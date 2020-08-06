public class Example {

    private int count = 0;

    public String getMessage() {
        return "Hello, tests!";
    }

    public String parity(int n) {
        if (n % 2 == 0)  {
            return "even";
        } else {
            return "odd";
        }
    }

    public String direction(int n) {
        switch (n) {
            case 0: return "up";
            case 1: return "right";
            case 2: return "down";
            case 3: return "left";
            default: return null;
        }
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int getCount() {
        System.out.println("Retrieving count: " + count);
        return count++;
    }

}
