package algoritms.intro;

public class FindMaxInArray {
    public static void main(String[] args) {
        double[] a = {4, 6,10, 155, 13, 0};
        double max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max - " + max);
    }
}
