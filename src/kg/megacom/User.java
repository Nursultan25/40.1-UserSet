package kg.megacom;

public class User {
    private String username;
    private int id;
    private String email;
    private int password;
    private boolean isSubscribed;

    public User() {
    }

    public User(String username, int id, String email, int password, boolean isSubscribed) {
        this.username = username;
        this.id = id;
        this.email = email;
        this.password = password;
        this.isSubscribed = isSubscribed;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public void toPrint() {
        System.out.println("Name of the user: " + username + "; id: " + id + "; email: " + email + "; password: " + password + "; is subscribed: " + isSubscribed);
    }
}
