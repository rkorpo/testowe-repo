public class IntConverter {
    public static void main(String[] args) {
        int x = 12;

        System.out.println("Binary: " + Integer.toBinaryString(x));
        System.out.println("Octal: " + Integer.toOctalString(x));
        System.out.println("Hexal: " + Integer.toHexString(x));
    }
}
