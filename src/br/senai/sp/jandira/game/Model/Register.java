package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {

        Player player = new Player();

        Enemy enemy = new Enemy();

        Output output = new Output();

        Scanner teclado = new Scanner(System.in);

        public void PlayerRegister(){

            System.out.println("******************************************");
            System.out.println("*********    Cadastro Player   ***********");
            System.out.println("******************************************");
            System.out.println(" ");
            System.out.println("Qual é seu nome: ");
            player.name = teclado.nextLine();
            System.out.println("Selecione sua skin (red, blue green) : ");
            player.skin = teclado.nextLine();
            System.out.println("Player cadastrado com sucesso!!");
            System.out.println("******************************************");

            output.Print(player);
        };

        public void EnemyRegister(){
            System.out.println("******************************************");
            System.out.println("*********    Cadastro Player   ***********");
            System.out.println("******************************************");
            System.out.println("Qual é seu nome: ");
            enemy.name = teclado.nextLine();
            System.out.println("Selecione sua skin (red, blue green) : ");
            enemy.skin = teclado.nextLine();
            System.out.println("Player cadastrado com sucesso!!");
            System.out.println("******************************************");

            output.Print(enemy);
        };

        public void BothRegister(){
            PlayerRegister();
            EnemyRegister();

        };


        public void Decision(){

            String decision;

            System.out.println("Seja Bem-vindo !!");
            System.out.println(" ");
            System.out.println("O que deseja cadastrar (Player, Inimigo ou Ambos)? ");
            decision = teclado.nextLine();

            /** estrutura swich case*/
            switch (decision){
                case "Player":
                    PlayerRegister();
                    break;

                case "Enemy":
                    EnemyRegister();
                    break;

                case "Ambos":
                    BothRegister();
                    break;

                default:
                    System.out.println("Opção inválida!! Digite uma opção válida");
                    Decision();
            }
        }
}
