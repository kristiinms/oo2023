public class Pilet {
    Piletimuuk piletimuuk;
    String sündmus;
    String kuupäev;
    String asukoht;
    int kood;

    public Pilet(String sündmus, String kuupäev, String asukoht, int kood) {
        this.sündmus = sündmus;
        this.kuupäev = kuupäev;
        this.asukoht = asukoht;
        this.kood = kood;
    }

    public void uuendaAsukohta(String uusAsukoht) {
        this.asukoht = uusAsukoht;
    }

    public void uuendaKuupäeva(String uusKuupäev) {
        this.kuupäev = uusKuupäev;
    }

    public int piletikood() {
        return this.kood;
    }
}