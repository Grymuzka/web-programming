package secondtask;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private final String imie;

    private final String nazwisko;

    private final int odlegloscOdUczelni;

    private final short aktualnySemestrStudiow;

    private final TypStudiow typStudiow;

    private float[] oceny;

    public Student(String imie, String nazwisko, int odlegloscOdUczelni, short aktualnySemestrStudiow, TypStudiow typStudiow, float[] oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.odlegloscOdUczelni = odlegloscOdUczelni;
        this.aktualnySemestrStudiow = aktualnySemestrStudiow;
        this.typStudiow = typStudiow;
        this.oceny = oceny;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getOdlegloscOdUczelni() {
        return odlegloscOdUczelni;
    }

    public short getAktualnySemestrStudiow() {
        return aktualnySemestrStudiow;
    }

    public TypStudiow getTypStudiow() {
        return typStudiow;
    }

    public float[] getOceny() {
        return oceny;
    }

    public void setOceny(float[] oceny) {
        this.oceny = oceny;
    }

    public int liczbaSemestrowDoKoncaStudiow() {
        switch (typStudiow) {
            case INZYNIERSKIE -> {return 7 - aktualnySemestrStudiow;}
            case LICENCJALCKIE -> {return 6 - aktualnySemestrStudiow;}
            case MAGISTERSKIE -> {return 4 - aktualnySemestrStudiow;}
            default -> throw new IllegalStateException("Unexpected value: " + typStudiow);
        }
    }

    public float sredniaOcen() {
        if (oceny != null && oceny.length != 0) {
            float suma = 0;
            int licznik = 0;
            for (float ocena : oceny) {
                if (ocena >= 3) {
                    suma += ocena;
                    licznik++;
                }
            }
            return suma / licznik;
        }
        throw new IllegalArgumentException("Brak ocen do wyliczenia średniej");
    }

    public boolean czyPrzyslugujeAkademik() {
        return odlegloscOdUczelni > 100 && sredniaOcen() > 3.5f;
    }

    public void wyswietl() {
        StringBuilder gradesStrBuilder = new StringBuilder();

        for (int i = 0; i < oceny.length; i++) {
            gradesStrBuilder.append(oceny[i]);
            if (i < oceny.length - 1) {
                gradesStrBuilder.append(", ");
            }
        }

        String gradesStr = !gradesStrBuilder.isEmpty() ? gradesStrBuilder.toString() : "Brak ocen";

        System.out.println(imie + " " + nazwisko + ", " + typStudiow + ", " +
                aktualnySemestrStudiow + " semestr, oceny : " + gradesStr);
    }

    public float kwotaStypendium() {
        if (sredniaOcen() <= 4.0) {
            return 0;
        } else if (sredniaOcen() > 4.0 && sredniaOcen() < 4.5) {
            return 300;
        } else {
            return 500;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return odlegloscOdUczelni == student.odlegloscOdUczelni && aktualnySemestrStudiow == student.aktualnySemestrStudiow && Objects.equals(
                imie,
                student.imie) && Objects.equals(nazwisko, student.nazwisko) && typStudiow == student.typStudiow && Objects.deepEquals(
                oceny,
                student.oceny);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, odlegloscOdUczelni, aktualnySemestrStudiow, typStudiow, Arrays.hashCode(oceny));
    }
}
