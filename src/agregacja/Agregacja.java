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

