import java.util.ArrayList;
import java.util.List;

public class Mängija{

    private List<Kaart> kaardid;
    private int ässasid;

    public Mängija() {
        kaardid = new ArrayList<>();
    }

    public int kaartideSumma() {
        int summa = 0;
        for (Kaart k: kaardid) {
            if(summa<=10 && ässasid==0&& k.getKirjeldus().equals("A")){
                summa+=11;
                this.ässasid++;
            } else summa += k.getVäärtus();
        }
        return summa;
    }

    public boolean kasÜle() {
        return kaartideSumma() > 21;
    }

    public boolean kas21() {return  kaartideSumma()==21;}

    public List<Kaart> getKaardid() {
        return kaardid;
    }

    public void lisaKaart(Kaart kaart) {
        kaardid.add(kaart);
        if (kaart.getKirjeldus().equals("A")) this.ässasid++;
        /*
        if (this.kasÜle()){
            //siin tuleks ässa väärtus teha 11 asemel üheks? vb
            //sp loemegi ässade arvu pakis et nende väärtust saaks vajadusel muuta
        }

         */
    }


}

