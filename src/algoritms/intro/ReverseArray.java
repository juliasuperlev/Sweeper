package algoritms.intro;

public class ReverseArray {
    public static void main(String[] args) {
        double[] a = {3, 9, 0, 8, 16, 5};
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            double temp = a[i];
            a[i] = a[N-1-i];
            a[N-i-1] = temp;
        }

        System.out.print("Reverse array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
