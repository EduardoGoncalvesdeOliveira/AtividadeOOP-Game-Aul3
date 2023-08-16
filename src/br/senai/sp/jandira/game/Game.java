package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.Model.Register;

public class Game {
    public static void main(String[] args) {

        /** instanciar O REGISTRO*/
        Register register = new Register();

        Register BothRegister = new Register();
        Register EnemRegister = new Register();
        Register PlayerRegister = new Register();

        register.Decision();
    }
}
