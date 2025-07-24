package ex03;

public class SessionUser {

    private int id;
    private String username;

    private static SessionUser instance = new SessionUser();

    private SessionUser() {
        this.id = 1;
        this.username = "ssar";
    }

    public static SessionUser getInstance() {
        return instance;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}