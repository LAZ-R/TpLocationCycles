package fr.eni.TpLocationVelo.bo;

/** Classe qui représente un Loueur (qui possède des Cycles)
 *
 * @author laz_R
 * @version 1.0
 */
public class Loueur {
    // Attributs d'instance

    // Attributs de classe
    Cycle[] liste_des_cycles = new Cycle[100];

    // Méthodes

    /** Méthode qui ajoute des cycles au tableau de Cycles de ce loueur
     *  (utilisé par les constructeurs).
     *
     * @param cycle Cycle
     */
    public void ajouterCycle(Cycle cycle) {
        for (int i = 0; i < liste_des_cycles.length; i++) {
            if (liste_des_cycles[i] == null) {
                liste_des_cycles[i] = cycle;
                break;
            }
        }
    }

    /** Méthode d'affichage des Cycles d'un loueur.
     */
    public void afficherCycles() {
        System.out.println("Voici les cycles que nous proposons à la location :");
        for (int i = 0; i < liste_des_cycles.length; i++) {
            if (liste_des_cycles[i] != null) {
                liste_des_cycles[i].afficher();
            }
        }
    }
}
