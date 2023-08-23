package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    Scanner teclado = new Scanner(System.in);

    Scenario scenario = new Scenario();

    public void choiseScenario(){

        System.out.println("Escolha o cenário");

        System.out.println("[1 - HopiHari 2 - Louvre 3 - Barra Funda 4 - Liberdade 5 - PradeParade 6 - Osasco]");
        int userScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(userScenario);

        System.out.println(scenarioBattle);


    }

    public void Battle(Player player, Enemy enemy){

        System.out.println(player.name);
        System.out.println(enemy.name);
    }
}
