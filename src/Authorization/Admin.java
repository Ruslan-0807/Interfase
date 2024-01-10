package Authorization;

public class Admin implements Authorisation{
    private String adminName;
    private String adminPassword;

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    @Override
    public  boolean check(String enteredPassword){
        return this.adminPassword.equals(enteredPassword);
    }
}

