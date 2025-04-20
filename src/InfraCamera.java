public class InfraCamera extends CameraN {
    public InfraCamera(int cameraID, String beeldmateriaal) {
        super(cameraID, beeldmateriaal);
    }

    @Override
    public String verzendBeeld() {
        return "Infrarood beeld verzonden: " + getBeeldmateriaal();
    }
}

