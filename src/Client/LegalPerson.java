package Client;

public class LegalPerson implements Client {
    private  String companyName;
    private  String companyNumber;

    public LegalPerson(String companyName, String companyNumber) {
        this.companyName = companyName;
        this.companyNumber = companyNumber;
    }
    @Override
    public void info(){
        System.out.println("Юридическая компания : " + companyName + " номер:" + companyNumber);

    }
}

