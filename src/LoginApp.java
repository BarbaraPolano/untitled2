import java.util.ArrayList;
import java.util.Scanner;

public class LoginApp {
    private static ArrayList<Gebruiker> gebruikers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        gebruikers.add(new Gebruiker("Admin", "admin@bat.nl", new Rol("admin")));

        System.out.println("Welkom bij het vleermuisdetectiesysteem!");
        System.out.print("Ben je een nieuwe gebruiker? (ja/nee): ");
        String antwoord = scanner.nextLine();

        if (antwoord.equalsIgnoreCase("ja")) {
            registreer();
        }

        login();
    }

    private static void registreer() {
        System.out.print("Naam: ");
        String naam = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        Rol rol = new Rol("gebruiker");

        Gebruiker nieuweGebruiker = new Gebruiker(naam, email, rol);
        gebruikers.add(nieuweGebruiker);
        System.out.println("Registratie succesvol!\n");
    }

    private static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();

        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Welkom, " + gebruiker.getNaam() + "!");
                if (gebruiker.getRol().getRolNaam().equals("admin")) {
                    new AdminScherm().toon(gebruiker);
                } else {
                    new GebruikerScherm().toon(gebruiker);
                }
                return;
            }
        }
        System.out.println("Geen gebruiker gevonden met dat emailadres.");
    }
}


