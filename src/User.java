public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String username;
    private String password;

private User(User b){
    username = b.username;
    password = b.password;
}
public static class Builder{
    private String username;
    private String password;


}
//povinne
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User Build(){
    return new User(this);
    }
//nepovinne
    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}