public class dz2_1 {
    public static void main(String[] args){
        int num1 = 20;
        byte num2 = 121;
        short num3 = 10000;
        long num4 = 92233720368575807L;
        float num5 = 3.14f;
        double num6 = 2.70828;
        boolean num7 = true;
        char num8 = 'A';
        String num9 = "I play guitar";

        System.out.println("Integer number: " + num1 + ", " + Integer.BYTES + " bytes");
        System.out.println("Byte number: " + num2 + ", " + Byte.BYTES + " bytes");
        System.out.println("Short number: " + num3 + ", " + Short.BYTES + " bytes");
        System.out.println("Long number: " + num4 + ", " + Long.BYTES + " bytes");
        System.out.println("Float number: " + num5 + ", " + Float.BYTES + " bytes");
        System.out.println("Double number: " + num6 + ", " + Double.BYTES + " bytes");
        System.out.println("Boolean number: " + num7 + ", 1 byte");
        System.out.println("Char number: " + num8 + ", " + Character.BYTES + " bytes");
        System.out.println("String number: " + num9 + ", " + String.CASE_INSENSITIVE_ORDER + " bytes");

    }
}
