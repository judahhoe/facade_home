import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Home smartHome = new Home();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w systemie sterowania inteligentnym domem!");

        boolean exit = false;

        while (!exit) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Rozpocznij dzień");
            System.out.println("2. Zmiana temperatury klimatyzacji");
            System.out.println("3. Zmiana koloru oświetlenia");
            System.out.println("4. Urządź imprezę!");
            System.out.println("5. Zakończ dzień");
            System.out.println("6. Wyjdź z programu");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    smartHome.startDay();
                    break;
                case 2:
                    System.out.println("Podaj nową temperaturę klimatyzacji (w stopniach Celsiusza):");
                    int temperature = scanner.nextInt();
                    smartHome.setTemperatureValue(temperature);
                    break;
                case 3:
                    System.out.println("Podaj nowy kolor oświetlenia w formacie RGB (np. 255 255 140):");
                    int r = scanner.nextInt();
                    int g = scanner.nextInt();
                    int b = scanner.nextInt();
                    smartHome.setLightingColor(r, g, b);
                    break;
                case 4:
                    smartHome.makeParty();
                    break;
                case 5:
                    smartHome.endDay();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja.");
            }
        }

        System.out.println("Wyjście z programu.");
        scanner.close();
    }
}