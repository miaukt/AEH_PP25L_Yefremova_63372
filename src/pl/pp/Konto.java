package pl.pp;

public class Konto {
    private String numer_konta;
    private double dostepne_srodki_na_koncie;
    private String nazwa_wlasciciela_konta;
    private String email;
    private String numer_telefonu;

    // Default constructor
    public Konto() {
    }

    // Constructor with initial deposit of 1000 PLN
    public Konto(String numer_konta, String nazwa_wlasciciela_konta, String email, String numer_telefonu) {
        this.numer_konta = numer_konta;
        this.nazwa_wlasciciela_konta = nazwa_wlasciciela_konta;
        this.email = email;
        this.numer_telefonu = numer_telefonu;
        this.dostepne_srodki_na_koncie = 1000.0; // Initial deposit
    }

    // Getters and setters
    public String getNumer_konta() {
        return numer_konta;
    }

    public void setNumer_konta(String numer_konta) {
        this.numer_konta = numer_konta;
    }

    public double getDostepne_srodki_na_koncie() {
        return dostepne_srodki_na_koncie;
    }

    public void setDostepne_srodki_na_koncie(double dostepne_srodki_na_koncie) {
        if (dostepne_srodki_na_koncie >= 0) {
            this.dostepne_srodki_na_koncie = dostepne_srodki_na_koncie;
        }
    }

    public String getNazwa_wlasciciela_konta() {
        return nazwa_wlasciciela_konta;
    }

    public void setNazwa_wlasciciela_konta(String nazwa_wlasciciela_konta) {
        this.nazwa_wlasciciela_konta = nazwa_wlasciciela_konta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    // Method to display account information
    public void getInfo() {
        System.out.println("Konto: " + numer_konta + ", Właściciel: " + nazwa_wlasciciela_konta +
                ", Email: " + email + ", Telefon: " + numer_telefonu +
                ", Saldo: PLN " + String.format("%.2f", dostepne_srodki_na_koncie));
    }

    // Method to handle deposit
    public void wplata(double kwota) {
        if (kwota > 0) {
            dostepne_srodki_na_koncie += kwota;
            System.out.println("Wplata PLN " + String.format("%.2f", kwota) + " z konta. Pozostale saldo = PLN " +
                    String.format("%.2f", dostepne_srodki_na_koncie));
        } else {
            System.out.println("Kwota wplaty musi byc dodatnia.");
        }
    }

    // Method to handle withdrawal
    public void wyplata(double kwota) {
        if (kwota > 0) {
            if (kwota <= dostepne_srodki_na_koncie) {
                dostepne_srodki_na_koncie -= kwota;
                System.out.println("Wyplata PLN " + String.format("%.2f", kwota) + " z konta. Pozostale saldo = PLN " +
                        String.format("%.2f", dostepne_srodki_na_koncie));
            } else {
                System.out.println("Niewystarczajace srodki na koncie. Saldo: PLN " +
                        String.format("%.2f", dostepne_srodki_na_koncie));
            }
        } else {
            System.out.println("Kwota wyplaty musi byc dodatnia.");
        }
    }
}