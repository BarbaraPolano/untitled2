import java.util.ArrayList;

public class Gebruiker {
    private int gebruikerID;
    private String naam;
    private String email;
    private Rol rol;
    private ArrayList<Rapport> rapporten;

    public Gebruiker() {
        this.rapporten = new ArrayList<>();
    }

    public Gebruiker(String naam, String email, Rol rol) {
        this.naam = naam;
        this.email = email;
        this.rol = rol;
        this.rapporten = new ArrayList<>();
    }

    public void voegRapportToe(Rapport rapport) {
        rapporten.add(rapport);
    }


    public int getGebruikerID() {
        return gebruikerID;
    }

    public void setGebruikerID(int gebruikerID) {
        this.gebruikerID = gebruikerID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<Rapport> getRapporten() {
        return rapporten;
    }
}

