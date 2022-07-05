import java.util.Arrays;

public class Smartphone implements Radio, GPS{

    String modelName;
    String manufacturerName;
    Contact [] contacts;

    public Smartphone() {
    }

    public Smartphone(String modelName, String manufacturerName, Contact[] contacts) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.contacts = contacts;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Mainz";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
