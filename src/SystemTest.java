import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SystemTest {

    @Test
    public void testVerzendBeeldOverrideInfraCamera() {
        InfraCamera camera = new InfraCamera(1, "infrabeeld_123.jpg");
        String resultaat = camera.verzendBeeld();
        assertEquals("Infrarood beeld verzonden: infrabeeld_123.jpg", resultaat);
    }

    @Test
    public void testRapportMetDataToevoeging() {
        Rapport rapport = new Rapport("Bosgebied A", "ecologisch");
        Data data = new Data("22:00", "sonar", "vleermuis gehoord");
        rapport.voegDataToe(data);

        ArrayList<Data> dataLijst = rapport.getMetingen().get(0).getDataItems();


        assertNotNull(rapport);
        assertEquals(1, rapport.getClass()
                .getDeclaredFields()[1].getType().equals(ArrayList.class) ? 1 : 0);
    }

    @Test
    public void testGebruikerHeeftCorrecteRolEnRapport() {
        Rol rol = new Rol("ecologisch adviseur");
        Gebruiker gebruiker = new Gebruiker("Lieke", "lieke@mail.com", rol);

        assertEquals("ecologisch adviseur", gebruiker.getRol().getRolNaam(), "Rol moet 'ecologisch adviseur' zijn");

    }

}
