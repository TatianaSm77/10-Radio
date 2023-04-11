package ru.netology;

public class Radio {

    private final int minNumber = 0;
    private final int stantionNumber = 10;
    private int currentNumber;

    private int maxNumber = stantionNumber - 1;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio(int stantionNumber) {
        this.maxNumber = stantionNumber - 1;
    }

    public Radio() {

    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minNumber) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
    }

    public void prevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

