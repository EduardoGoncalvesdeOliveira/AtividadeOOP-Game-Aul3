package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    Battle battle = new Battle();
    Register register = new Register();

    public void Menu() {

        Scenario scenario = new Scenario();

        boolean continuar = true;

        while (continuar) {


            System.out.println("/-/-/-/-/-/-/-/-/");

            System.out.println("/-/- Bem vindo!!/-/-/-");

            System.out.println("Escolha uma opção: ");

            System.out.println("[1 - Register 2 - Battle 3 - Exit]");

            System.out.println("/-/-/-/-/-/-/-/-/");

            int userOption = teclado.nextInt();

            switch (userOption) {
                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.choiseScenario();
                    battle.Battle(register.player, register.enemy);
                    System.out.println("Feature in development");
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }
}
