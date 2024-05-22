package ru.netology.NetologyJavaHW9.services;

public class RadioService {
    public int currentStation;
    public int maxStation = 9;
    public int minStation = 0;
    public int nextStation;
    public int prevStation;
    public int currentVolume;
    public int maxVolume;
    public int minVolume;
    public int increasedVolume;
    public int decreasedVolume;

    public RadioService(int maxStation) {
        this.maxStation = maxStation;
    }

    public RadioService() {

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getNextStation() {
        return nextStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    /*public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }*/

    public void setCurrentStation(int newCurrentStation) {
        if (currentStation < maxStation) {
            nextStation = currentStation + 1;
        }

        if (currentStation == maxStation) {
            prevStation = currentStation - 1;
        }
        {
            currentStation = newCurrentStation;
        }
    }

    public void setNextStation(int newNextStation) {
        if (currentStation < maxStation) {
            newNextStation = currentStation + 1;
        }
        nextStation = newNextStation;

    }

    public void setPrevStation(int newPrevStation) {
        if (currentStation > minStation) {
            newPrevStation = currentStation - 1;
        }
        prevStation = newPrevStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getIncreasedVolume() {
        return increasedVolume;
    }

    public int getDecreasedVolume() {
        return decreasedVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            return;
        }
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        this.minVolume = minVolume;
    }

    public void setIncreasedVolume(int newIncreasedVolume) {
        if (currentVolume <= maxVolume) {
            newIncreasedVolume = currentVolume + 1;
        }
        increasedVolume = newIncreasedVolume;
    }

    public void setDecreasedVolume(int newDecreasedVolume) {
        if (currentVolume >= maxVolume) {
            decreasedVolume = currentVolume - 1;
        }
        decreasedVolume = newDecreasedVolume;
    }
}



