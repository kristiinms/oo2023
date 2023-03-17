public class Klient {
    Piletimuuk piletimuuk;
    String nimi;
    String email;
    int kliendiId;

    public Klient(String nimi, String email, int kliendiId) {
        this.nimi = nimi;
        this.email = email;
        this.kliendiId = kliendiId;
    }

    public void uuendaEmail(String uusEmail) {
        this.email = uusEmail;
    }

    public int kliendiId() {
        return this.kliendiId;
    }
}