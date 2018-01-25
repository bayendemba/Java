package mabanque;

import entities.CompteBancaire;
import entities.ListesCompteBancaire;

public class Main {

    public static void main(String[] args) {
        ListesCompteBancaire listesCompteBancaire =new ListesCompteBancaire(3);
        CompteBancaire c1 = new CompteBancaire("Seye","Dakar", 1200000000);
        CompteBancaire c2 = new CompteBancaire("M. Diop","Fatick", 90000);
        c1.afficherEtat();
        c1.debiter(1000);
        c1.afficherEtat();
        listesCompteBancaire.ajout(c2);
        listesCompteBancaire.rechercherCompteParNom("M. Diop");
        c2.afficherEtat();
    }
}
