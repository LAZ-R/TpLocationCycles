package fr.eni.TpLocationVelo.bo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

/** Classe abstraite qui représente un Cycle
 *
 * @author laz_R
 * @version 1.0
 */
public abstract class Cycle {

    //Attributs d'instance
    protected Loueur loueur;
    protected String marque;
    protected String modele;
    protected LocalDate date_achat;
    protected long age;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param marque String
     * @param modele String
     * @param date_achat String
     */
    public Cycle(Loueur loueur, String marque, String modele, LocalDate date_achat) {
        this.loueur = loueur;
        this.marque = marque;
        this.modele = modele;
        this.date_achat = date_achat;

        this.age = date_achat.until(LocalDate.now(), ChronoUnit.YEARS);

        this.loueur.ajouterCycle(this);
    }

    /** Méthode d'affichage des informations du Cycle.
     */
    public void afficher(){
        System.out.printf("%s %s (%d an(s)) ", this.marque, this.modele, this.age);
    }
}
