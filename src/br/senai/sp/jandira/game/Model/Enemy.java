package br.senai.sp.jandira.game.Model;

public class Enemy {
    public String name;
    public String skin;
    public int life = 1000;

    public Enemy(){
        life = 100;
    }

    public int GetLife(){
        return life;
    }
}
