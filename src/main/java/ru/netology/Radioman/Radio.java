package ru.netology.Radioman;

public class Radio {

    private int currentStation;
    private int stationsQuantity = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio (int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
        this.maxStation = stationsQuantity - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void setStationsQuantity(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int nextStation() {
        currentStation = currentStation < maxStation ? currentStation + 1 : minStation;
        return currentStation;
    }

    public int prevStation() {
        currentStation = currentStation > minStation ? currentStation - 1 : maxStation;
        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }
}