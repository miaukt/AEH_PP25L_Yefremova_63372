package pl.pp;

public abstract class Bilet {
    protected String tytulWydarzenia;
    protected String miejsce;
    protected double cena;

    public Bilet(String tytulWydarzenia, String miejsce, double cena) {
        this.tytulWydarzenia = tytulWydarzenia;
        this.miejsce = miejsce;
        this.cena = cena;
    }

    public abstract void rezerwuj();

    public void anuluj() {
        System.out.println("Rezerwacja anulowana dla: " + tytulWydarzenia);
    }

    @Override
    public String toString() {
        return tytulWydarzenia + " | Miejsce: " + miejsce + " | Cena: " + cena + " zł";
    }
}
