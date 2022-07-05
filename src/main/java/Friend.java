public class Friend extends Contact{
    String phoneNumber;

    public Friend() {
    }

    public Friend(String name, String phoneNumber) {
        super();
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
