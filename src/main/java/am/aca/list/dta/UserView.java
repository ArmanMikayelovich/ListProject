package am.aca.list.dta;

public class UserView {
    private int id;
    private String fullName;

    public UserView(int id, String firstName, String lastName) {
        this.id = id;
        this.fullName = firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
