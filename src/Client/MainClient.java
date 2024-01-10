package Client;

public class MainClient {
    public static void main(String[] args) {
        LegalPerson legalPerson = new LegalPerson("Алди", "78997776");
        PhysicalPerson physicalPerson = new PhysicalPerson(" Анатолий ", "Дрезден");
        physicalPerson.info();
        legalPerson.info();
    }
}
