public class GebruikerScherm {
    public void toon(Gebruiker gebruiker) {
        System.out.println("Gebruiker: " + gebruiker.getNaam());
        System.out.println("Rol: " + gebruiker.getRol().getRolNaam());

        for (Rapport rapport : gebruiker.getRapporten()) {
            rapport.toonRapport();
        }
    }
}
