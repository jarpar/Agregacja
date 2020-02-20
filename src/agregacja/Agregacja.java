package agregacja;

public class Agregacja {
    public static void main(String[] args) {
        Pracownik p = new Pracownik("Andrzej", new Adres("Szkolna", 1));
        System.out.println(p);
    }
}

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

class Adres {
    String ulica;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }

    int nrDomu;
}