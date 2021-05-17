package fr.eni.TpLocationVelo.bo;

import java.time.LocalDate;

/** Classe qui représente un Vélo (qui est un Cycle).
 *
 * @author laz_R
 * @version 1.0
 */
public class Velo extends Cycle{

    // Attributs d'interface
    private int nombre_de_vitesses;
    protected double tarif = 4.90;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param marque String
     * @param modele String
     * @param date_achat LocalDate
     * @param nombre_de_vitesses int
     */
    public Velo(Loueur loueur, String marque, String modele, LocalDate date_achat, int nombre_de_vitesses) {
        super(loueur, marque, modele, date_achat);
        this.nombre_de_vitesses = nombre_de_vitesses;
    }

    /** Méthode d'affichage des informations du Cycle + nombre de vitesses + tarif.
     */
    @Override
    public void afficher() {
        System.out.printf("• Vélo     ");
        super.afficher();
        System.out.printf("%d vitesses %.2f€/heure%n", this.nombre_de_vitesses, this.tarif);
    }
}
