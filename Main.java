class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java docker");

        int num = 5;
        int otherNum = giveMeNumber();
        System.out.println(num + otherNum);
    }

    private static int giveMeNumber() {
        return 10;
    }
}