package agregacja;

class Pracownik {
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", adres=" + adres +
                '}';
    }
}
