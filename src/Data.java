public class Data {
    private String tijdstip;
    private String sensorType;
    private String waarde;

    public Data(String tijdstip, String sensorType, String waarde) {
        this.tijdstip = tijdstip;
        this.sensorType = sensorType;
        this.waarde = waarde;
    }

    public String getTijdstip() {
        return tijdstip;
    }

    public String getSensorType() {
        return sensorType;
    }

    public String getWaarde() {
        return waarde;
    }

    public String beschrijving() {
        return "[" + tijdstip + "] " + sensorType + ": " + waarde;
    }
}
