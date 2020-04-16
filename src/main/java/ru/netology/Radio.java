package ru.netology;

public class Radio {

    private int currentStation;
    private int maxVolume = 9;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void nextStation(){
        if (this.currentStation == this.maxVolume){
            this.currentStation = this.minVolume;
            return;
        }
        this.currentStation++;
    }

    public void prevStation(){
        if(this.currentStation == this.minVolume){
            this.currentStation = this.maxVolume;
            return;
        }
        this.currentStation--;
    }
}