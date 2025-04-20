import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Rol rol = new Rol();
        rol.setRolID(1);
        rol.setRolNaam("Onderzoeker");


        Gebruiker gebruiker = new Gebruiker();
        gebruiker.setGebruikerID(1);
        gebruiker.setNaam("Sanne");
        gebruiker.setEmail("sanne@mail.com");
        gebruiker.setRol(rol);


        Rapport rapport = new Rapport();
        rapport.setRapportID(1);
        rapport.setDatum(new Date());
        rapport.setType("Observatie");
        rapport.setLocatie("Bosgebied A");
        rapport.setGebruiker(gebruiker);


        Meting meting = new Meting();
        meting.setMetingID(101);

        Data data = new Data();
        data.setDataID(1);
        data.setTijdstip(new Date());
        data.setWeerData("Helder en droog");

        InfraCamera infraCamera = new InfraCamera();
        infraCamera.setCameraID(10);
        infraCamera.setBeeldmateriaal("Infrabeeld_1");

        GeluidsDetectie geluidsDetectie = new GeluidsDetectie();
        geluidsDetectie.setMicrofoonID(5);
        geluidsDetectie.setGeluidsopnames("Vleermuis-echo.wav");

        data.setCameraData(infraCamera);
        data.setGeluidsData(geluidsDetectie);


        meting.voegDataToe(data);


        rapport.getMetingen().add(meting);

        gebruiker.getRapporten().add(rapport);

        System.out.println("---- RAPPORT GEGENEREERD ----");
        rapport.genereerRapport();

        System.out.println("\n---- METING VERWERKEN ----");
        meting.verwerkMeting();

        System.out.println("\n---- POLYMORF VERZEND ----");
        CameraN cam = new InfraCamera();
        cam.setBeeldmateriaal("Polymorf beeld");
        System.out.println(cam.verzendBeeld());
    }
}