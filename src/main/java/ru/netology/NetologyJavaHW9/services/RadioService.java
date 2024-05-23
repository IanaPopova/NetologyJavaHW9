package ru.netology.NetologyJavaHW9.services;

public class RadioService {
    private int currentVolume;
    private int currentStation;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToIncreasedVolume() {
        if (currentVolume < 100) {
            int inc = currentVolume + 1;
            setCurrentVolume(inc);
        }
    }

    public void setToDecreasedVolume() {
        if (currentVolume > 0) {
            int dec = currentVolume - 1;
            setCurrentVolume(dec);
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public int getMaxStation() {
        return currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public int getMinStation() {
        return currentStation = 0;
    }

    public void setToNextStation() {
        int next = currentStation + 1;
        setCurrentStation(next);
    }

    public void setToPrevStation() {
        int prev = currentStation - 1;
        setCurrentStation(prev);
    }

    public void setMinStationIfAboveMax() {
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void setMaxStationIfBelowMin() {
        if (currentStation < 0) {
            this.currentStation = 9;
        }
    }
}



