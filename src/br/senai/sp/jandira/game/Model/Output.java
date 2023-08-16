package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Output {

    Scanner teclado = new Scanner(System.in);

    public void Print(Player printerPlayer) {
        System.out.println("------------------------------------------");
        System.out.println("O nome do player é: " + printerPlayer.name);
        System.out.println("A skin do player é: " + printerPlayer.skin);
        System.out.println("A life do enemy é: " + printerPlayer.GetLife());

    }

    public void Print(Enemy printerEnemy) {
        System.out.println("------------------------------------------");
        System.out.println("O nome do enemy é: " + printerEnemy.name);
        System.out.println("A skin do enemy é: " + printerEnemy.skin);
        System.out.println("A life do enemy é: " + printerEnemy.GetLife());
    }
}