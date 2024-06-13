package org.example;

public enum trafficLights {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration;

    trafficLights(int duration) {
        this.duration = duration;
    }

    public int getDuration(){
        return this.duration;
    }
}

