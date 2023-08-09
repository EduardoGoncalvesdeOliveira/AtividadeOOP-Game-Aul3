package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Output {

    Scanner teclado = new Scanner(System.in);

    public void Print(Player printerPlayer) {

        System.out.println("O nome do player é: " + printerPlayer.name);

    }

    public void Print(Enemy printerEnemy) {

        System.out.println("O nome do player é: " + printerEnemy.name);

    }
}