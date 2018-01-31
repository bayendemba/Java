
# Méthode Main

```java
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
```

# La Class CompteBancaire
```java
package entities;
public class CompteBancaire {
    private String nom, addresse;
    private int solde, numero;

    public static int premierNumeroDisponible = 1;

    public CompteBancaire(String unnom, String uneaddresse) {
        nom = unnom;
        addresse = uneaddresse;
        numero = premierNumeroDisponible;
        solde = 0;
        premierNumeroDisponible++;
    }

    public CompteBancaire(String nom, String addresse, int solde) {
        nom = nom;
        addresse = addresse;
        this.solde = solde;
        premierNumeroDisponible++;
    }

    public void crediter(int montant) {
        solde += montant;
    }

    public void debiter(int montant) {
        if (montant <= solde)
            solde -= montant;
        System.out.println("Vous n avez pas assez d argent pour effectuer cette operation");
    }

    public void afficherEtat() {
        System.out.println("Compte Numéro: " + numero + "ouvert au nom de " + nom);
        System.out.println("Addresse du titulaire"+addresse);
        System.out.println("Le solde actuel du compte est de :"+solde+" Fcfa");
        System.out.println("******************************************************");
    }

    public String getNom() {
        return nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public int getNumero() {
        return numero;
    }
}
```
