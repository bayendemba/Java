
## Gestion Contact
# Methode Main
```java
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
```
# Entité Contact
```java
package iam.estd;

public class Contact {
    private String numero;
    private String nom;

    public Contact(String num, String nom) {
        numero = num;
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afficheContact() {
        System.out.println("Nom:  " + nom);
        System.out.println("Numero:  " + numero);
    }
}
```
# Enité ContactAmi héritant la class Contact
```java
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
```
# La class Repertoire
```java
package iam.estd;

public class Repertoire {
    //Données
    private Contact R[];
    private int N; // La taille maximale du repertoire.
    private int n; // La taille courante du repertoire.

    // Methodes


    public Repertoire(int N) {
        R = new Contact[this.N = N];
        n = 0;
    }

    public boolean ajoutContact(Contact contact) {
        if (n <= N) {
            R[n++] = contact;
            return true;
        }
        return false;
    }

    /*
     * Pour comparer en Java en terme de contenu il faut utiliser  comparTo()
     * ou bien equals()
     */
    public Contact getContact(String nom) {
        for (int i = 0; i < n; i++)
            if (R[i].equals(nom)) //  if(R[i].equalsCompareTo(nom)==0)
                return R[i];
        return null;
    }

    public void afficherRepertoire() {
        for (int i = 0; i < n; i++)
            R[i].afficheContact();
    }
}
```
