package fr.eni.TpLocationVelo.bo;

import java.time.LocalDate;

/** Classe abstraite qui représente un Cycle avec motorisation (donc autonomie).
 *
 * @author laz_R
 * @version 1.0
 */
public abstract class Gyro extends Cycle{

    // Attributs d'interface
    protected int autonomie_en_km;

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param marque String
     * @param modele String
     * @param date_achat LocalDate
     * @param autonomie_en_km int
     */
    public Gyro(Loueur loueur, String marque, String modele, LocalDate date_achat, int autonomie_en_km) {
        super(loueur, marque, modele, date_achat);
        this.autonomie_en_km = autonomie_en_km;
    }

    /** Méthode d'affichage des informations du Cycle + autonomie.
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.printf("%d km d'autonomie ", autonomie_en_km);
    }
}
