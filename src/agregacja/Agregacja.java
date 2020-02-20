package agregacja;

public class Agregacja {
    public static void main(String[] args) {
        Pracownik p = new Pracownik("Andrzej", new Adres("Szkolna", 1));
        System.out.println(p);


        System.out.println();
        //użycie 'finally' w obsłudze wyjątków
        try {
            System.out.println(5 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(5 / 1);
        }

        System.out.println();
        int a = 10;
        try {

            if (a == 10)
                throw new NaszWyjatek("a jet równe 10 blabla");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
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

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }
}

class NaszWyjatek extends Exception {
    public NaszWyjatek(String string) {
        super((string));
    }
}