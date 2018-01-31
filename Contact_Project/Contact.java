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
