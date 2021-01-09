public class SntNhoHon100 {
    public static void main(String[] args) {

        for (int N = 2; N < 100; N++){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
        }
    }
}
