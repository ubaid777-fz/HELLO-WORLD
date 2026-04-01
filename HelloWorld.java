public class HelloWorld {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for-loop
            for (String name : args) {
                result += name + " ";
            }

            // Remove last space using substring
            result = result.substring(0, result.length() - 1);

            System.out.println("Hello " + result);
        }
    }
}