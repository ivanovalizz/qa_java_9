package ru.netology.qa_java_9.services;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public int setToNextStation() {
        if (currentStation == 9) {
            return currentStation = 0;
        } else {
            return currentStation++;
        }
    }

    public int setToPrevStation() {
        if (currentStation == 0) {
            return currentStation = 9;
        } else {
            return currentStation--;
        }
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

    public int increaseVolume() {
        if (currentVolume >= 100) {
            return currentVolume;
        } else {
            return currentVolume++;
        }
    }

    public int reduceVolume() {
        if (currentVolume <= 0) {
            return currentVolume;
        } else {
            return currentVolume--;
        }
    }

}


