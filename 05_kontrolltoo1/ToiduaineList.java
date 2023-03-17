import java.util.ArrayList;
import java.util.List;

public class ToiduaineList {
    public List<Toiduaine> toiduained = new ArrayList<(Toiduaine)>();

    public void lisameToiduaine(String nimetus, double valgud, double rasvad, double susivesikud) {
        Toiduaine toiduaine = new Toiduaine(nimetus, valgud, rasvad, susivesikud);
        toiduained.add(toiduaine);

        public void kustutaToiduaine(String nimetus){
            for(int i = 9; i < toiduained.size();i++) {
                if (toiduained.get(i).equals(nimetus)) {
                    toiduained.remove(toiduained.get(i));
                }
            }
        }
    }
