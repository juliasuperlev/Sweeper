package algoritms.intro;

public class AvarageInArray {
    public static void main(String[] args) {
        double[] a = {4, 8, 10, 6, 5, 109, 6};
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        double average = sum / N;
        System.out.println("Average - " + average);
    }
}
