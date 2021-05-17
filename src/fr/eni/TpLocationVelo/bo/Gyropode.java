package fr.eni.TpLocationVelo.bo;

import java.time.LocalDate;

/** Classe qui représente un Gyropode (Qui est un Gyro, qui est un Cycle, sauf qu'il possède une taille minimum requise.
 *
 * @author laz_R
 * @version 1.0
 */
public class Gyropode extends Gyro{

    // Attributs d'interface
    private int taille_minimum_en_cm;
    protected double tarif = 29.90;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param marque String
     * @param modele String
     * @param date_achat LocalDate
     * @param autonomie_en_km int
     * @param taille_minimum_en_cm int
     */
    public Gyropode(Loueur loueur, String marque, String modele, LocalDate date_achat, int autonomie_en_km, int taille_minimum_en_cm) {
        super(loueur, marque, modele, date_achat, autonomie_en_km);
        this.taille_minimum_en_cm = taille_minimum_en_cm;
    }

    /** Méthode d'affichage des informations du Cycle + autonomie + taille minimum + tarif.
     */
    @Override
    public void afficher() {
        System.out.printf("• Gyropode ");
        super.afficher();
        System.out.printf("[%.2fm minimum] %.2f€/heure%n", (double)taille_minimum_en_cm /100, tarif);
    }
}
