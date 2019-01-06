package algoritms.intro.my_library;

public class StdRandom {
    public static double random() {
        double tmp = Math.random();
        return tmp;
    }

    public static int uniform(int N) {
        return (int) (StdRandom.random() * N);
    }

    public static double uniform(double a, double b) {
        return a + StdRandom.random() * (b-a);
    }

    public static int discrete(double[] a) {
        double r = StdRandom.random();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum >- r)
                return i;
        }
        return -1;
    }

    public static void shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
