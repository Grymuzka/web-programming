package fifthtask;

public class MojaLiczba {

    private int liczba;

    public MojaLiczba(int liczba) {
        this.liczba = liczba;
    }

    public boolean czyNieparzysta() {
        return liczba % 2 == 1;
    }

    public boolean czyParzysta() {
        return !czyNieparzysta();
    }

    public double pierwiatsek() {
        return Math.sqrt(liczba);
    }

    public double potega(int potega) {
        return Math.pow(liczba, potega);
    }

    public int odejmij(int mojaLiczba) {
        return liczba - mojaLiczba;
    }
}
