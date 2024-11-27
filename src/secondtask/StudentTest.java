package secondtask;


public class StudentTest {
    public static void main(String[] args) {
        // Tworzenie obiektów Student
        Student student1 = new Student("Jan", "Nowak", 101, (short) 2, TypStudiow.MAGISTERSKIE, new float[] { 4f, 3.0f, 3.5f, 2.0f });
        Student student2 = new Student("Anna", "Kowalska", 12, (short) 2, TypStudiow.LICENCJALCKIE, new float[] { 4f, 2.0f, 3.5f, 2.0f });
        Student student3 = new Student("Piotr", "Zieliński", 67, (short) 2, TypStudiow.INZYNIERSKIE, new float[] { 4.5f, 4.5f, 4.5f, 5.0f });

        // Wyświetlanie danych studentów
        System.out.println("Dane studentów:");
        student1.wyswietl();
        student2.wyswietl();
        student3.wyswietl();

        // Wyświetlanie kwot stypendiów
        System.out.println("\nKwoty stypendiów:");
        System.out.println("Stypendium dla " + student1.getImie() + ": " + student1.kwotaStypendium() + " zł");
        System.out.println("Stypendium dla " + student2.getImie() + ": " + student2.kwotaStypendium() + " zł");
        System.out.println("Stypendium dla " + student3.getImie() + ": " + student3.kwotaStypendium() + " zł");
    }
}
