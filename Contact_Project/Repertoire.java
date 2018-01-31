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
