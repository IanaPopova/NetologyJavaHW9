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
        if (currentStation < 9) {
            int next = currentStation + 1;
            setCurrentStation(next);
        } else {
            this.currentStation = 0;
        }
    }

    public void setToPrevStation() {
        if (currentStation > 0) {
            int prev = currentStation - 1;
            setCurrentStation(prev);
        } else {
            this.currentStation = 9;
        }
    }
}



