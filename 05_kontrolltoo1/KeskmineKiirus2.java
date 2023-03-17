public class KeskmineKiirus2 {

    // funktsioonile antakse 1km-de lõikude läbimise kiirused. väljasta kogu tee keskmise kiirus.
    public static void main(String[] args) {
        double[] kiirused = {60.0, 50.0, 70.0}; // kiirused kilomeetrites tunnis
        double[] vahemaa = {1.0, 1.0, 1.0}; // lõikude pikkused kilomeetrites
        Kiirus2(kiirused, vahemaa);
    }

    private static void Kiirus2(double[] kiirused, double[] vahemaa) {
        double koguVahemaa = 0.0;
        double koguKiirus = 0.0;

        // kogu tee pikkus
        for (double vahemaad : vahemaa) {
            koguVahemaa += vahemaad;
        }

        // kesk. kiirus
        for (int i = 0; i < kiirused.length; i++) {
            koguKiirus += kiirused[i] * vahemaa[i];
        }

        double keskmine = koguKiirus / koguVahemaa;

        System.out.println("Kogu tee läbimise keskmine kiirus: " + keskmine + " km/h");
    }
}