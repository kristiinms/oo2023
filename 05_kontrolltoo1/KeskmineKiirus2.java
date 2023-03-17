public class KeskmineKiirus2 {

    //funktsioonile antakse 1km-de lõikude läbimise kiirused. väljasta kogu tee keskmise kiirus.
        public static void main(String[] args) {
            double[] kiirused = {60.0, 50.0, 70.0}; // kiirused kilomeetrites tunnis
            double[] vahemaa = {1.0, 1.0, 1.0}; // lõikude pikkused kilomeetrites
            double totalDistance = 0.0;
            double weightedSpeedSum = 0.0;

            // leiame kogu tee pikkuse
            for (double distance : vahemaa) {
                totalDistance += distance;
            }

            // leiame keskmise kiiruse
            for (int i = 0; i < kiirused.length; i++) {
                weightedSpeedSum += kiirused[i] * vahemaa[i];
            }
            double averageSpeed = weightedSpeedSum / totalDistance;

            System.out.println("Kogu tee läbimise keskmine kiirus: " + averageSpeed + " km/h");
        }
    }
