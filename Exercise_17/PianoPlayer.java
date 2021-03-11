package com.app;

public class PianoPlayer extends Player{
    @Override
    public void play() {
        System.out.println("Playing Bach...");
    }

    @Override
    public void compose() {
        System.out.println("Composing piano melody");
    }

    public void practice(){
        System.out.println("Practice makes perfect!");
    }

    public void playJazz(){
        System.out.println("Playing iGot Rhythm by George Gershwin");
    }
}
