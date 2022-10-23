package com.hildi.javacore.sprint3.task5;

public abstract class Pet {
    private final String voice;

    Pet(String voice) {
        this.voice = voice;
    }

    public void sleep(){
        System.out.println("Сплю");
    }
    public void play() {
        System.out.println("Играю");
    }

    public String getVoice() {
        return this.voice;
    }

    public void giveVoice() {
        System.out.println(getVoice());
    }

}
