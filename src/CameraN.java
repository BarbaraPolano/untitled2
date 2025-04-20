import java.util.Random;

public abstract class CameraN implements Verzendbaar {
    private int cameraID;
    private String beeldmateriaal;

    public CameraN(int cameraID, String beeldmateriaal) {
        this.cameraID = cameraID;
        this.beeldmateriaal = beeldmateriaal;
    }

    public int getCameraID() {
        return cameraID;
    }

    public void setCameraID(int cameraID) {
        this.cameraID = cameraID;
    }

    public String getBeeldmateriaal() {
        return beeldmateriaal;
    }

    public void setBeeldmateriaal(String beeldmateriaal) {
        this.beeldmateriaal = beeldmateriaal;
    }

    @Override
    public String verzendBeeld() {
        return "Beeldmateriaal verzonden: " + beeldmateriaal;
    }
}

