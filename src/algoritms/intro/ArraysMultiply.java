package algoritms.intro;

public class ArraysMultiply {
    public static void main(String[] args) {
        double[][] a = {{1, -2}, {2, 0}};
        double[][] b = {{-3, -2}, {2, -4}};

        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Array c:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
