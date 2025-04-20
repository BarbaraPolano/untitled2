import java.util.ArrayList;
import java.util.Date;

public class Rapport {
    private int rapportID;
    private Date datum;
    private String type;
    private String locatie;
    private ArrayList<Meting> metingen;
    private Gebruiker gebruiker;

    public Rapport() {
        this.metingen = new ArrayList<>();
    }


    public Rapport(String locatie, String type) {
        this.locatie = locatie;
        this.type = type;
        this.metingen = new ArrayList<>();
    }

    public void voegMetingToe(Meting meting) {
        metingen.add(meting);
    }

    public void toonRapport() {
        System.out.println("Rapport voor locatie: " + locatie + " (" + type + ")");
        for (Meting m : metingen) {
            m.verwerkMeting();
        }
    }

    public void voegDataToe(Data data) {
        if (metingen.isEmpty()) {
            Meting nieuweMeting = new Meting();
            nieuweMeting.voegDataToe(data);
            metingen.add(nieuweMeting);
        } else {
            metingen.get(metingen.size() - 1).voegDataToe(data);
        }
    }


    public int getRapportID() {
        return rapportID;
    }

    public void setRapportID(int rapportID) {
        this.rapportID = rapportID;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public ArrayList<Meting> getMetingen() {
        return metingen;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }
}
