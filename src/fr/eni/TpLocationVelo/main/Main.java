package fr.eni.TpLocationVelo.main;

import fr.eni.TpLocationVelo.bo.Gyropode;
import fr.eni.TpLocationVelo.bo.Gyroroue;
import fr.eni.TpLocationVelo.bo.Loueur;
import fr.eni.TpLocationVelo.bo.Velo;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Loueur loueur = new Loueur();

        Velo lapierre_speed_400 = new Velo(
                loueur,
                "Lapierre",
                "Speed 400",
                LocalDate.of(2017,11,24),
                27);

        Velo btwin_riverside_900 = new Velo(
                loueur,
                "Btwin",
                "Riverside 900",
                LocalDate.of(2017,11,24),
                10);



        Gyropode segway_ninebot_elite = new Gyropode(
                loueur,
                "Segway",
                "Ninebot Elite",
                LocalDate.of(2018, 10, 9),
                40,
                150);

        Gyropode weebot_echo = new Gyropode(
                loueur,
                "Weebot",
                "Echo",
                LocalDate.of(2020, 10, 9),
                35,
                160);



        Gyroroue immotion_v8 = new Gyroroue(
                loueur,
                "Immotion",
                "V8",
                LocalDate.of(2021, 2, 15),
                40);

        Gyroroue segway_ninebot_one_ePlus = new Gyroroue(
                loueur,
                "Segway",
                "Ninebot One E+",
                LocalDate.of(2021, 4, 15),
                30);

        //segway_ninebot_elite.afficher();
        loueur.afficherCycles();
    }

}
