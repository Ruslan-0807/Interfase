package Authorization;

public class User implements Authorisation{
    private String user;
    private String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }


    @Override
    public  boolean check(String enteredPassword){
        return this.password.equals(enteredPassword);
    }
}
