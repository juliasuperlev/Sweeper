package algoritms.intro;

public class Hypotenuse {
    public static void main(String[] args) {
        Hypotenuse instance = new Hypotenuse();
        double hypotenuse = instance.hypotenuse(3, 2);
        System.out.println("Hypotenuse: " + hypotenuse);
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}
