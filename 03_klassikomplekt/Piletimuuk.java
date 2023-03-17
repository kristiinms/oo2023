public class Piletimuuk {
    Pilet pilet;
    double hind;
    int kogus;
    int id;

    public Piletimuuk(Pilet pilet, double hind, int kogus, int id) {
        this.pilet = pilet;
        this.hind = hind;
        this.kogus = kogus;
        this.id = id;
    }

    public double ostusumma() {
        return this.hind * this.kogus;
    }

    public void muudaHinda(double uusHind) {
        this.hind = uusHind;
    }

    public void muudaKogust(int uusKogus) {
        this.kogus = uusKogus;
    }

    public int kliendiId() {
        return this.id;
    }
}