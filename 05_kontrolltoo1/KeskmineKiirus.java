public class KeskmineKiirus {

    public static double calculateAverageSpeed(double kiirus1, double kiirus2) {
        return (kiirus1 + kiirus2) / 2;
    }

    public static void main(String[] args) {
        double kiirus1 = 50.0;
        double kiirus2 = 70.0;

        double keskmine = KeskmineKiirus.calculateAverageSpeed(kiirus1, kiirus2);

        System.out.println("Keskmine kiirus on: " + keskmine);
    }
}

