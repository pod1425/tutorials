package test;

public class Test {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("integer number, example: " + a + ", 4 bytes");
        byte b = 126;
        System.out.println("we do have b days" + "byte -1");
        short c = 32555;
        System.out.println(c + " " + "bytes -2");
        long d = 4777777777L;
        System.out.println(d + " " + "bytes -8");
        float e = 2;
        System.out.println(e + " " + "bytes -4");
        double f = 6.18;
        System.out.println(f + " " + "bytes -8");

        char j = 97;
        System.out.println(j);
        System.out.println((a * b) + (c * e));
        System.out.println("ce nevydymyi ryadok \n");
        String str = "Have a good day";
        System.out.println(str);
    }
}
