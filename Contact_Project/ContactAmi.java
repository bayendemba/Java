package iam;

public class ContactAmi extends Contact {
    private String dateNaiss, addresse, email;

    public ContactAmi(String num, String nom, String dateNaiss, String addresse, String email) {
        /*
         * L'appel du constructeur de la classe mere
         */
        super(num, nom); //Permet d appeler les attributs de la classe mere
        this.dateNaiss = dateNaiss;
        this.addresse = addresse;
        this.email = email;
    }

    public String getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
      Redefinition de methode.
     */
    @Override
    public void afficheContact() {
        super.afficheContact(); // L'appel de la methode affiche de la classe mere.
        System.out.println("Date de naissance: " + dateNaiss);
        System.out.println("adresse: " + addresse);
        System.out.println("Email: " + email);
    }
}
