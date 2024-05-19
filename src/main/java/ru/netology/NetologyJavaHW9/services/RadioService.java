package ru.netology.NetologyJavaHW9.services;

public class RadioService {
    public int currentStation;
    public int maxStation;
    public int minStation;
    public int nextStation;
    public int prevStation;
    public int currentVolume;
    public int maxVolume;
    public int minVolume;
    public int increasedVolume;
    public int decreasedVolume;

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

            public void setMaxStation ( int maxStation){
                this.maxStation = maxStation;
            }

            public void setMinStation ( int minStation){
                this.minStation = minStation;
            }

            public void setNextStation ( int newNextStation){
                if (currentStation < maxStation) {
                    newNextStation = currentStation + 1;
                }
                this.nextStation = newNextStation;
            }

            public void setPrevStation ( int newPrevStation){
                if (currentStation == maxStation) {
                    newPrevStation = currentStation - 1;
                }
                this.prevStation = newPrevStation;
            }

            public void setCurrentStation ( int CurrentStation){
                if (currentStation < maxStation) {
                    nextStation = currentStation + 1;
                }

                if (currentStation == maxStation) {
                    prevStation = currentStation - 1;
                }
                {
                    this.currentStation = CurrentStation;
                }
            }

            public int getCurrentVolume () {
                return currentVolume;
            }

            public int getMaxVolume () {
                return maxVolume;
            }

            public int getMinVolume () {
                return minVolume;
            }

            public int getIncreasedVolume () {
                return increasedVolume;
            }

            public int getDecreasedVolume () {
                return decreasedVolume;
            }

            public void setCurrentVolume ( int newCurrentVolume){
                if (currentVolume > maxVolume) {
                    return;
                }
                if (currentVolume < minVolume) {
                    return;
                }
                this.currentVolume = newCurrentVolume;
            }

            public void setMaxVolume ( int newMaxVolume){
                if (currentVolume == newMaxVolume) {
                    return;
                }
                this.maxVolume = newMaxVolume;
            }

            public void setMinVolume ( int newMinVolume){
                if (currentVolume == newMinVolume) {
                    return;
                }
                this.minVolume = newMinVolume;
            }

            public void setIncreasedVolume ( int newIncreasedVolume){
                if (currentVolume < maxVolume) {
                    newIncreasedVolume = currentVolume + 1;
                }
                this.increasedVolume = newIncreasedVolume;
            }

            public void setDecreasedVolume ( int newDecreasedVolume){
                if (currentVolume == maxVolume) {
                    newDecreasedVolume = currentVolume - 1;
                }
                this.decreasedVolume = newDecreasedVolume;
            }
        }


    /* public void changeStation() {

            if (currentStation < maxStation) {
               nextStation = currentStation + 1;
           }
         }
         {
           if (currentStation == maxStation) {
               prevStation = currentStation - 1;
           }
    }

    public int stationIsGoingRoundIfMax() {
        if (currentStation > maxStation) {
            return minStation;
        }
        return minStation;
    }

    public int stationIsGoingRoundIfMin() {
        if (currentStation < minStation) {
            return maxStation;
        }
        return maxStation;
    }

    }

    public int StationIsGoingRoundIfMin() {
       if (currentStation < minStation) {
            return maxStation;
        }
        return maxStation;
    }


    public void changeVolume() {
        if (currentVolume < maxVolume) {
            increasedVolume = currentVolume + 1;
        }

        if (currentVolume == maxVolume) {
            decreasedVolume = currentVolume - 1;
        }
    }

    public void volumeMargin(int currentVolume, int maxVolume, int minVolume) {
       if (currentVolume == maxVolume) {
            return;
        }

        if (currentVolume == minVolume) {
           return;
 */


