package ClassLectures.twentiethClass;

public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String user, String password) {
        this.username = user;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + username + '\'' +
                ", password='" + password + '\'' + "Added this" +
                '}';
    }
}
