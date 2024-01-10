package Authorization;

public class MainAuthorization {
    public static void main(String[] args) {
        User userP = new User(" Анатолий ","wj563");
        System.out.println("Пароль " + userP.check("wj563"));
        User userA = new User(" Анатолий ","12345");
        System.out.println("Пароль администратора " + userA.check("12345"));
    }
}
