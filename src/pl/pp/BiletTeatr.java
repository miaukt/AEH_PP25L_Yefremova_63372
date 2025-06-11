package pl.pp;

public class BiletTeatr extends Bilet implements TypMiejsca {
    public BiletTeatr(String tytul, String miejsce, double cena) {
        super(tytul, miejsce, cena);
    }

    @Override
    public void rezerwuj() {
        System.out.println("Zarezerwowano bilet do teatru: " + tytulWydarzenia);
    }

    @Override
    public String getTypMiejsca() {
        return "SIEDZĄCE";
    }
}
