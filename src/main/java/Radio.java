public class Radio {
    private int currentStation;
    private int currentVolume;

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

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }
        {
            currentStation = maxStation;
        }
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;

        } else {
            currentStation = 0;
        }
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


}






