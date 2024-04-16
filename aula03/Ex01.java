public class Ex01 {
    public static void main(String[] args) {
        int fibo = 1, n = 0;

        System.out.println(n);
        System.out.println(fibo);
        for(int i = 0; i < 8; i++) {
            fibo = fibo + n;
            n = fibo - n;
            System.out.println(fibo);
        }

    }
}
