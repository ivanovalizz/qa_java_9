package ru.netology.qa_java_9.services;

public class Radio {

    private int minStation = 0;
    private int maxStation;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        this.maxStation = minStation + size - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public int setToNextStation() {
        if (currentStation == maxStation) {
            return currentStation = minStation;
        } else {
            return currentStation++;
        }
    }

    public int setToPrevStation() {
        if (currentStation == minStation) {
            return currentStation = maxStation;
        } else {
            return currentStation--;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume >= maxVolume) {
            return currentVolume;
        } else {
            return currentVolume++;
        }
    }

    public int reduceVolume() {
        if (currentVolume <= minVolume) {
            return currentVolume;
        } else {
            return currentVolume--;
        }
    }

}


