import java.util.ArrayList;

public class Policeman {

    private static int POLICEMEN_COUNT = 0;
    private static int ACTIVE_POLICEMEN;
    public int ID = 0;
    private String name, surname, login;
    private boolean isActive = false;
    ArrayList<Policeman> partners = new ArrayList<>();


    public Policeman(String name, String surname, String login) {
        POLICEMEN_COUNT++;
        this.ID = POLICEMEN_COUNT;
        this.name = name;
        this.surname = surname;
        this.login = login;

    }

    public int activatePoliceman() {
        ACTIVE_POLICEMEN++;
        this.isActive = true;
        return ACTIVE_POLICEMEN;
    }

    public int deactivatePoliceman() {
        ACTIVE_POLICEMEN--;
        this.isActive = false;
        return ACTIVE_POLICEMEN;
    }

    public void addPartner(Policeman p) {
        this.partners.add(p);
        p.partners.add(this);
    }

    public void removePartner(Policeman p) {
        this.partners.remove(p);
    }

    public void displayInfo() {

        System.out.print(name + " "+ surname + " " + login + " " + ID + " " + isActive + " ");

        this.displayPartnerList();

        System.out.println();


    }

    public void displayAllActiveInfo() {
        if (isActive) {
            System.out.println(name + " " + surname + " " + login + " " + ID );
        }


    }

    public void displayPartnerList(){
        System.out.println(this.partners);
    }

}
