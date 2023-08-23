package br.senai.sp.jandira.game.Model;

public class Scenario {

    public String Scenario(int scenarioOption){

        String scenario = "Senai Jandira";

        switch (scenarioOption){
            case 1:
                scenario = "hopihari";
                break;

            case 2:
                scenario = "Louvre";
                break;

            case 3:
                scenario = "Barra Funda";
                break;

            case 4:
                scenario = "Libardade";
                        break;

            case 5:
                scenario = "PradeParade";
                break;

            case 6:
                scenario = "Osasco";
                break;
        }
        return scenario;
    }

}
