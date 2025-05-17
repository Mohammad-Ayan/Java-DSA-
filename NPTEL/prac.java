public class prac {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }

    static class Test {
        void start() {
            int a = 4;
            int b = 5;
            System.out.print("" + 8 + 3 + "");
            System.out.print(a + b);
            System.out.print(" " + a + b + "");
            System.out.print(foo() + a + b + " ");
            System.out.println(a + b + foo());
        }

        String foo() {
            return "foo";
        }
    }
}

