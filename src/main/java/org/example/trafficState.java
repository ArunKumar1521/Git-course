package org.example;

public class trafficState {
    private trafficLights currentState;

    public trafficState(){
        currentState = trafficLights.RED;
    }

    public void  changeState (){
        switch (currentState){
            case RED -> currentState = trafficLights.GREEN;
            case GREEN -> currentState = trafficLights.YELLOW;
            case YELLOW -> currentState = trafficLights.RED;
        }
    }
    public int getcurrentStateDurations(){
        return currentState.getDuration();
    }
    public trafficLights getCurrentState(){
        return currentState;
    }

}
