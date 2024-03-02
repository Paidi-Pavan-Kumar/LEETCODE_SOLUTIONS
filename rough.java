public class rough {
    public static void main(String[] args) {
        String x = "001";
        int y = 10;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.parseInt("110"));
        System.out.println(Integer.parseInt("11100"));
        System.out.println(Integer.compare(1,-1));
        System.out.println(Integer.valueOf(x));
        System.out.println(Integer.numberOfLeadingZeros(100));
        System.out.println(Integer.numberOfTrailingZeros(1010));
    }
}
