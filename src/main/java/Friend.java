public class Friend extends Contact {
    String phoneNumber;

    public Friend() {
    }

    public Friend(String name, String phoneNumber) {
        this.name=name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
