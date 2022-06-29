public class Radio {
    public int currentStation;


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


    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        if (currentStation == 0) {
            currentStation = 9;
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
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }

    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }
}



