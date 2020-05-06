public class Main {
    public static void main (String[] args){

        Policeman pol1 = new Policeman("John", "Smith", "JS1");
        Policeman pol2 = new Policeman("Randy", "Lahey", "JS1");
        Policeman pol3 = new Policeman("Cory", "Trevor", "JS1");
        Policeman pol4 = new Policeman("Phil", "Collins", "JS1");
        Policeman pol5 = new Policeman("Will", "Smith", "JS1");
        Policeman pol6 = new Policeman("Willy", "Wonka", "JS1");



        pol1.activatePoliceman();
        pol2.activatePoliceman();
        pol3.activatePoliceman();
        pol4.activatePoliceman();
        pol5.activatePoliceman();

        pol1.addPartner(pol2);
        pol2.addPartner(pol3);



        pol1.displayInfo();
        pol2.displayInfo();
        





        pol1.displayAllActiveInfo();
        pol2.displayAllActiveInfo();
        pol3.displayAllActiveInfo();
        pol4.displayAllActiveInfo();
        pol5.displayAllActiveInfo();
        pol6.displayAllActiveInfo();





    }
}
