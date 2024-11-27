package fourthtask;

public class Prostokat {

    private double dlugosc;
    private double szerokosc;

    private double getPole() {
        return szerokosc * dlugosc;
    }

    private double getObwod() {
        return 2 * szerokosc + 2 * dlugosc;
    }

    private double getPrzekatna() {
        return Math.sqrt(Math.pow(szerokosc, 2) + Math.pow(dlugosc, 2));
    }
}
