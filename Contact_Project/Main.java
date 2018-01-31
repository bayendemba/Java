package iam;

public class Main {

    public static void main(String[] args) {

        Repertoire repertoire = new Repertoire(2);
        Contact c1 = new Contact("774356492", "Seye");
        ContactAmi c2 = new ContactAmi("775256162", "Ndiaye", "12-12-1990", "Dakar", "baye@gmail.com");

        repertoire.ajoutContact(c1);
        repertoire.ajoutContact(c2);
        repertoire.afficherRepertoire();
    }
}
