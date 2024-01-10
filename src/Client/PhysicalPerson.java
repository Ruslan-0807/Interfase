package Client;

public class PhysicalPerson implements Client {
    public String name;
    private String address;

    public PhysicalPerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void info() {
        System.out.println("Физическое лицо : " + name + "адрес:" + address);
    }
}
