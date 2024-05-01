public class recursion01 {

    static void fun1(int i , int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
        fun1(i + 1, n);
    }


    static void fun2(int i, int n) {
        if(i < 1) {
            return;
        }
        fun2(i - 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        fun2(5,5);
    }
}