package ru.netology.Radioman;

public class Radio {

    private int currentStation;
    private int stationsQuantity = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio () {
    }

    public Radio (int stationsQuantity) {
        if (stationsQuantity < 10) {
            stationsQuantity = 10;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void setStationsQuantity(int stationsQuantity) {
        if (stationsQuantity < 10) {
            stationsQuantity = 10;
        }
        this.stationsQuantity = stationsQuantity;
    }

    public int getMaxStation() {
        maxStation = stationsQuantity - 1;
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        currentStation = currentStation < (stationsQuantity - 1) ? (currentStation += 1) : minStation;
    }

    public void prevStation() {
        currentStation = currentStation > minStation ? (currentStation - 1) : (stationsQuantity - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void minusVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}