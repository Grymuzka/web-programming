public class HelloWorld {
    public static void main(String[] args) {
        // 1.1 - 1.4
        System.out.print("Hello World !");

        // 1.5
        System.out.println("First arg: " + args[0]);

        // 1.6
        for (String arg : args) {
            System.out.println(arg);
        }

        // 1.7
        for (String arg : args) {
            System.out.println(arg.toUpperCase());
        }
    }
}
