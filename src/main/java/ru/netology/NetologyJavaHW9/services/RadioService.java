package ru.netology.NetologyJavaHW9.services;

public class RadioService {
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public RadioService(int numberOfStations) {
        numberOfStations = 10;
    }

    public RadioService() {
        maxStation = 9;
    }

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
        int inc = currentVolume + 1;
        setCurrentVolume(inc);
    }

    public void setToDecreasedVolume() {
        int dec = currentVolume - 1;
        setCurrentVolume(dec);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setToNextStation() {
        if (currentStation < maxStation) {
            int next = currentStation + 1;
            setCurrentStation(next);
        } else {
            this.currentStation = minStation;
        }
    }

    public void setToPrevStation() {
        if (currentStation > minStation) {
            int prev = currentStation - 1;
            setCurrentStation(prev);
        } else {
            this.currentStation = maxStation;
        }
    }
}