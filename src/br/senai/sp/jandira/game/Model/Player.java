package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
    public int life = 100;

    public Player(){
        life = 100;
    }

    public int GetLife(){
        return life;
    }
}
