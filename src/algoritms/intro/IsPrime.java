package algoritms.intro;

public class IsPrime {
    public static void main(String[] args) {
        IsPrime instance = new IsPrime();
        boolean answer = instance.isPrime(17);
        if (answer == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
