public class Main {
    public static void main (String[] args){
       Toiduaine tomat = new Toiduaine("tomat",15, 10,75);

       Toidukomponent toidukomponent1 = new Toidukomponent (100, tomat);
        //rasvad
        double tomatRasvadeKogus = tomat.getRasvadeProtsent();
        System.out.println("Kartulite rasvade kogus: " + tomatRasvadeKogus+ " g");
    }
}