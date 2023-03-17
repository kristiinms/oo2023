public class Toiduaine {
        private String nimetus;
        private double valkudeProtsent;
        private double rasvadeProtsent;
        private double susivesikuteProtsent;


    public Toiduaine(String nimetus, double valkudeProtsent, double rasvadeProtsent, double susivesikuteProtsent) {
        this.nimetus = nimetus;
        this.valkudeProtsent = valkudeProtsent;
        this.rasvadeProtsent = rasvadeProtsent;
        this.susivesikuteProtsent = susivesikuteProtsent;
        if (valkudeProtsent + rasvadeProtsent + susivesikuteProtsent > 100) {
            System.out.println("Koguprotsent ei saa olla suurem kui 100.");
        } else {
            System.out.println("Sobilik.");
        }
    }

    public String getNimetus() {
        return nimetus;
    }

    public double getValkudeProtsent() {
        return valkudeProtsent;
    }

    public double getRasvadeProtsent() {
        return rasvadeProtsent;
    }

    public double getSusivesikuteProtsent() {
        return susivesikuteProtsent;
    }
}






