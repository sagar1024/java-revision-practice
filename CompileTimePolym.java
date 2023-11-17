public class CompileTimePolym {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolym example1 = new CompileTimePolym();

        //The compiler determines which function to call based on the number, types, and order of arguments

        int result1 = example1.add(10, 20);
        System.out.println("Addition of two integers: " + result1);

        double result2 = example1.add(10.5, 20.25);
        System.out.println("Addition of two doubles: " + result2);
    }
}
