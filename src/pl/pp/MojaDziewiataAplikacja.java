package pl.pp;

class MojaDziewiataAplikacja {
    public static void main(String[] args) {
        Magazyn magazyn1 = new Magazyn("M1", 5000, "owner@magazyn.pl", "+48 123 456 789");
        System.out.println("Dostępna przestrzeń magazynowa: " + magazyn1.getDostepnaPrzeztzenMagazynowa() + " jednostek.");

        magazyn1.dodajTowar(3000);
        magazyn1.dodajTowar(2500);
        magazyn1.dodajTowar(4500);

        magazyn1.sprawdzZajetosc();

        magazyn1.aktualizujKontakt("newowner@magazyn.pl", "+48 123 456 789");
    }
}