package fr.eni.TpLocationVelo.bo;

public class Loueur {
    // Attributs d'instance

    // Attributs de classe
    Cycle[] liste_des_cycles = new Cycle[100];

    // Méthodes
    public void ajouterCycle(Cycle cycle) {
        for (int i = 0; i < liste_des_cycles.length; i++) {
            if (liste_des_cycles[i] == null) {
                liste_des_cycles[i] = cycle;
                break;
            }
        }
    }

    public void afficherCycles() {
        System.out.println("Voici les cycles que nous proposons à la location :");
        for (int i = 0; i < liste_des_cycles.length; i++) {
            if (liste_des_cycles[i] != null) {
                liste_des_cycles[i].afficher();
            }
        }
    }
}
