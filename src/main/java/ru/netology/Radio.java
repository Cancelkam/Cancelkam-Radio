package ru.netology;

public class Radio {

    int CurrentStation;
    int VolumeLevel;

    public int getCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int currentStation) {
        CurrentStation = currentStation;
    }

    public void nextStation (){
    if (this.CurrentStation == 9) {
        this.CurrentStation=0;
        return;
    }
        this.CurrentStation++;
    }

    public void prevStation (){
        if (this.CurrentStation == 0) {
            this.CurrentStation=9;
            return;
        }
        this.CurrentStation--;
    }

    public int getVolumeLevel() {
        return VolumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        VolumeLevel = volumeLevel;
    }
}