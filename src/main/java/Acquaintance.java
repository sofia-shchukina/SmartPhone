public class Acquaintance extends Contact{
    public Acquaintance(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Acquaintance{" +
                "name='" + name + '\'' +
                '}';
    }
}
