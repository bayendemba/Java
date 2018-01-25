package entities;

public class ListesCompteBancaire {
    private CompteBancaire[] tabComptes;
    private int capaciteMax, nbComptes;

    public ListesCompteBancaire(int n) {
        capaciteMax = n;
        tabComptes = new CompteBancaire[n];
        nbComptes = 0;
    }

    public void ajout(CompteBancaire compteBancaire) {
        /*
         * Ajouter le nouveau compte dans la première case vide
         * qui porte le numéro nbComptes !
         */
        tabComptes[nbComptes] = compteBancaire;
        nbComptes++;
    }

    public CompteBancaire rechercherCompteParNom(String nom) {
        boolean trouve = false;
        int indice = 0;
        for (int i = 0; i < nbComptes; i++) {
            if (nom.equalsIgnoreCase(tabComptes[i].getNom())) {
                trouve = true; // J'ai trouvé
                indice = i; // mémoriser l'indice
                break; //plus besoin de continuer la recherche
            }
            if (trouve)
                return tabComptes[indice];
            else
                return null; // si rien trouvé, je rend la référence nulle
        }
        return null;
    }

    public CompteBancaire recherhcerCompteParNumero(int numero) {
        boolean trouve = false;
        int indice = 0;
        for (int i = 0; i < nbComptes; i++) {
            if (numero == tabComptes[i].getNumero()) {
                trouve = true;
                indice = i;
                break;
            }
            if (trouve)
                return tabComptes[indice];
            else
                return null;
        }
        return null;
    }

    public void afficherEtat() {
        for (int i = 0; i < nbComptes; i++)
            tabComptes[i].afficherEtat();
    }

    public String supprimer(CompteBancaire compteBancaire) {

        boolean trouve = false; // rien trouvé pour l'instant
        int indice = 0;
        for (int i = 0; i < nbComptes; i++) {
            if (tabComptes[i] == compteBancaire) { //attention comparaison de références
                trouve = true;
                indice = i;
                break;
            }
            if (trouve) {
                // Décaler le reste du tableau vers la gauche

                // On "écrase" ainsi le compte à supprimer
                for (int a = indice + 1; a < nbComptes; a++) {
                    tabComptes[a - 1] = tabComptes[a];
                }
                // Mettre à jour le nombre de comptes
                nbComptes--;
                return "Compte supprimé";
            } else {
                return "je n'ai pas trouvé ce compte";
            }
        }
        return null;
    }

    //Rendre le liste des noms
    public String[] listeDesNoms() {
        String[] liste = new String[nbComptes]; // créer un tableau de chaînes
        for (int i = 0; i < nbComptes; i++) {
            liste[i] = tabComptes[i].getNom();
        }
        return liste;
    }

    public void virement(int numExp, int numDest, int montant) {
        CompteBancaire compteBancaireExp = recherhcerCompteParNumero(numExp);
        CompteBancaire compteBancaireDest = recherhcerCompteParNumero(numDest);
        compteBancaireExp.debiter(montant);
        compteBancaireDest.crediter(montant);
    }
}
