public class Main {
    public static void main(String[] args) {
        Pilet pilet1 = new Pilet("Kontsert", "01.01.2024", "Tallinna Lauluväljak", 12345);
        Klient klient1 = new Klient("Kristiin", "kristiin@gmail.com", 123456);
        Piletimuuk piletimuuk1 = new Piletimuuk(pilet1, 25.99, 2, klient1.kliendiId());

        System.out.println("Kliendi ID: " + piletimuuk1.kliendiId());
        System.out.println("Piletikood: " + pilet1.piletikood());
        System.out.println("Ostusumma: " + piletimuuk1.ostusumma());
    }
}

