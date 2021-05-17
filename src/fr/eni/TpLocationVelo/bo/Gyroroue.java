package fr.eni.TpLocationVelo.bo;

import java.time.LocalDate;

/** Classe qui représente une Gyroroue (un Gyro, qui est un Cycle)
 *
 * @author laz_R
 * @version 1.0
 */
public class Gyroroue extends Gyro{

    // Attributs d'interface
    protected double tarif = 18.90;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param marque String
     * @param modele String
     * @param date_achat LocalDate
     * @param autonomie_en_km int
     */
    public Gyroroue(Loueur loueur, String marque, String modele, LocalDate date_achat, int autonomie_en_km) {
        super(loueur, marque, modele, date_achat, autonomie_en_km);
    }

    /** Méthode d'affichage des informations du Cycle + autonomie + tarif.
     */
    @Override
    public void afficher() {
        System.out.printf("• Gyroroue ");
        super.afficher();
        System.out.printf("%.2f€/heure%n", this.tarif);
    }
}
