public class Toidukomponent {
        public double kogus;
        public Toiduaine toiduaine;

        public Toidukomponent(double kogus, Toiduaine toiduaine) {
            this.kogus = kogus;
            this.toiduaine = toiduaine;
        }

        public double getKogus() {
            return kogus;
        }

        public Toiduaine getToiduaine() {
            return toiduaine;
        }

        public double RasvadeKogus() {
            return kogus * toiduaine.getRasvadeProtsent() / 100;
        }
    }