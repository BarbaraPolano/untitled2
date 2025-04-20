public class GeluidsDetectie {
    private String microfoonID;
    private String geluidsopnames;

    public GeluidsDetectie(String microfoonID, String geluidsopnames) {
        this.microfoonID = microfoonID;
        this.geluidsopnames = geluidsopnames;
    }

    public String detecteer() {
        return "Geluid gedetecteerd: " + geluidsopnames;
    }

    public String getMicrofoonID() {
        return microfoonID;
    }

    public String getGeluidsopnames() {
        return geluidsopnames;
    }
}
