package algoritms.intro;

public class CopyToNewArray {
    public static void main(String[] args) {
        double[] a = {5, 6, 2, 6, 9, 0};
        int N = a.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }

        System.out.print("Array b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
