package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Register {



    int avaliaAmbos = 0;

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

            if (avaliaAmbos != 1) {
                output.Print(player);
            }
        };

        public void EnemyRegister(){
            System.out.println("*****************************************");
            System.out.println("*********    Cadastro Enemy   ***********");
            System.out.println("******************************************");
            System.out.println("Qual é o nome do Enemy: ");
            enemy.name = teclado.nextLine();
            System.out.println("Selecione a skin do Enemy (red, blue green) : ");
            enemy.skin = teclado.nextLine();
            System.out.println("Enemy cadastrado com sucesso!!");
            System.out.println("******************************************");

            if (avaliaAmbos != 1) {
                output.Print(enemy);
            }
        };

        public void BothRegister() {

            avaliaAmbos = 1;

            PlayerRegister();
            EnemyRegister();

                output.Print(player);
                output.Print(enemy);

        }


        public void Decision(){

            String decision;

            System.out.println("Seja Bem-vindo !!");
            System.out.println(" ");
            System.out.println("O que deseja cadastrar (Player, Inimigo ou Ambos)? ");
            decision = teclado.next();

            /** estrutura swich case*/
            switch (decision.toLowerCase()){
                case "Player", "P", "1", "player":
                    PlayerRegister();
                    break;

                case "Enemy", "E", "2", "enemy":
                    EnemyRegister();
                    break;

                case "Ambos", "A", "3", "ambos":
                    BothRegister();
                    break;

            }

            System.out.println("-----------------------------------------");
            System.out.println("Você deseja continuar? [1-sim e 2-não]:");
            int continuar = teclado.nextInt();

            if (continuar == 1){
                Decision();
            }
        }
}
