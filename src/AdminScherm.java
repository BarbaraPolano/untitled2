import java.util.ArrayList;

public class AdminScherm {
    public void toon(Gebruiker admin) {
        System.out.println("Welkom, admin " + admin.getNaam());
        System.out.println("Dit is het administratiescherm voor rapportoverzicht.");
        System.out.println("Onderstaande rapporten zijn gelinkt aan gebruikers:\n");

        ArrayList<Gebruiker> alleGebruikers = new ArrayList<>();
        alleGebruikers.add(admin);

        for (Gebruiker g : alleGebruikers) {
            System.out.println("Gebruiker: " + g.getNaam());
            for (Rapport rapport : g.getRapporten()) {
                rapport.toonRapport();
                System.out.println("moet ik nog invullen");
            }
        }
    }
}
