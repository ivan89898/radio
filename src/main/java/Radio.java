public class Radio {
    public int currentStation;
    public int maxStation;
    public int maxVolume;

    public Radio() {
        maxVolume = 100;
        maxStation = 9;
    }

    public Radio(int stationsCount, int volumeCount) {
        maxStation = stationsCount - 1;
        maxVolume = volumeCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }
        if (currentStation == 0) {
            currentStation = maxStation;
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }

    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        }
        if (currentStation == maxStation) {
            currentStation = 0;
        }
    }
}






