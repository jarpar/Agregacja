package agregacja;

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
