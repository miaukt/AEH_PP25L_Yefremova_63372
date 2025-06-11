package pl.pp;

public class BiletKoncert extends Bilet implements TypMiejsca {
    private boolean stojace;

    public BiletKoncert(String tytul, String miejsce, double cena, boolean stojace) {
        super(tytul, miejsce, cena);
        this.stojace = stojace;
    }

    @Override
    public void rezerwuj() {
        System.out.println("Zarezerwowano bilet na koncert: " + tytulWydarzenia);
    }

    @Override
    public String getTypMiejsca() {
        return stojace ? "STOJĄCE" : "SIEDZĄCE";
    }
}
