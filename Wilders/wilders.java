class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
    }
}

public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Jean-Claude", true);
        Wilder wilder2 = new Wilder("Henri", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}