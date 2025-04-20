import java.util.ArrayList;

public class Meting {
    private int metingID;
    private String tijdstip;
    private ArrayList<Data> dataItems;

    public Meting(int metingID, String tijdstip) {
        this.metingID = metingID;
        this.tijdstip = tijdstip;
        this.dataItems = new ArrayList<>();
    }

    public int getMetingID() { return metingID; }
    public String getTijdstip() { return tijdstip; }

    public void voegDataToe(Data data) {
        dataItems.add(data);
    }

    public ArrayList<Data> getDataItems() {
        return dataItems;
    }

    public void verwerkMeting() {
        System.out.println("Meting [" + tijdstip + "] bevat " + dataItems.size() + " data-items:");
        for (Data d : dataItems) {
            d.verwerkData();
        }
    }
}
