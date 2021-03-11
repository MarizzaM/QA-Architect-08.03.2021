package com.app;

public class Main {

    public static void main(String[] args) {

        Player alex = new GuitarPlayer();
        Player mary = new PianoPlayer();

        Player[] players = new Player[]{alex, mary};

        for (int i = 0; i < players.length; i++){
            startMusicShow(players[i]);
        }
    }

    public static void startMusicShow(Player player){

        if (player instanceof GuitarPlayer){
            GuitarPlayer guitarPlayer = (GuitarPlayer)player;
            guitarPlayer.rockAndRoll();
        } else if (player instanceof PianoPlayer){
            PianoPlayer pianoPlayer = (PianoPlayer)player;
            pianoPlayer.playJazz();
        }
    }
}