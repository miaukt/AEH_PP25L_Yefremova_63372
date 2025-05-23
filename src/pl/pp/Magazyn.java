package pl.pp;

public class Magazyn {
    private String numerMagazynu;
    private int dostepnaPrzeztzenMagazynowa;
    private String email;
    private String numerTelefonu;
    private final int POCZATKOWA_PRZESTRZEN = 5000;

    public Magazyn() {
    }

    public Magazyn(String numerMagazynu, int dostepnaPrzeztzenMagazynowa, String email, String numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzeztzenMagazynowa = dostepnaPrzeztzenMagazynowa;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }


    public String getNumerMagazynu() {
        return numerMagazynu;
    }

    public void setNumerMagazynu(String numerMagazynu) {
        this.numerMagazynu = numerMagazynu;
    }

    public int getDostepnaPrzeztzenMagazynowa() {
        return dostepnaPrzeztzenMagazynowa;
    }

    public void setDostepnaPrzeztzenMagazynowa(int dostepnaPrzeztzenMagazynowa) {
        this.dostepnaPrzeztzenMagazynowa = dostepnaPrzeztzenMagazynowa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void dodajTowar(int iloscJednostek) {
        if (iloscJednostek <= dostepnaPrzeztzenMagazynowa) {
            dostepnaPrzeztzenMagazynowa -= iloscJednostek;
            System.out.println("Dodano " + iloscJednostek + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzeztzenMagazynowa + " jednostek.");
        } else {
            System.out.println("Za mało miejsca w magazynie. Potrzebna przestrzeń: " + iloscJednostek + " jednostek. Dostępna przestrzeń: " + dostepnaPrzeztzenMagazynowa + " jednostek.");
        }
    }

    public void usunTowar(int iloscJednostek) {
        int zajetaPrzeztzen = POCZATKOWA_PRZESTRZEN - dostepnaPrzeztzenMagazynowa;
        if (iloscJednostek <= zajetaPrzeztzen) {
            dostepnaPrzeztzenMagazynowa += iloscJednostek;
            System.out.println("Usunięto " + iloscJednostek + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzeztzenMagazynowa + " jednostek.");
        } else {
            System.out.println("Nie ma tyle towaru w magazynie. Dostępna ilość towaru: " + zajetaPrzeztzen + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        int zajetaPrzeztzen = POCZATKOWA_PRZESTRZEN - dostepnaPrzeztzenMagazynowa;
        System.out.println("Zajęta przestrzeń: " + zajetaPrzeztzen + " jednostek. Wolna przestrzeń: " + dostepnaPrzeztzenMagazynowa + " jednostek.");
    }

    public void aktualizujKontakt(String email, String numerTelefonu) {
        this.email = email;
        this.numerTelefonu = numerTelefonu;
        System.out.println("Zaktualizowano dane kontaktowe: email = " + email + ", numer telefonu = " + numerTelefonu);
    }
}