package pl.pp;
public class MojaPietnastaAplikacja {
        public static void main(String[] args) {
            BiletKoncert koncert = new BiletKoncert("Open'er Festival", "Strefa A12", 199.99, true);
            BiletFilm film = new BiletFilm("Diuna 2", "Rząd C, miejsce 7", 35.00, true);
            BiletTeatr teatr = new BiletTeatr("Dziady", "Rząd B, miejsce 5", 45.00);

            Bilet[] bilety = { koncert, film, teatr };

            for (Bilet b : bilety) {
                System.out.println(b);
                b.rezerwuj();
                System.out.println("Typ miejsca: " + ((TypMiejsca) b).getTypMiejsca());
                System.out.println();
            }

            film.anuluj(); // пример аннуляции
        }
}
