package group_Integer.homework_5;

public class Main {
    public static void main(String[] args) {
//        5. Տպել  byte, short, int և long  Max & Min  արժեքները;
        byte bMax = Byte.MAX_VALUE;
        byte bMin = Byte.MIN_VALUE;
        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;
        System.out.println("byte max " + bMax + " min " + bMin);
        System.out.println("short max " + sMax + " min " + sMin);
        System.out.println("int max " + iMax + " min " + iMin);
        System.out.println("long max " + lMax + " min " + lMin);
    }
}
