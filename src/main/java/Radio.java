public class Radio {
    private int amountRadioStation;
    private int firstRadioStation;
    private int lastRadioStation;
    private int radioStation;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio(int inputAmountRadioStation) {
        if (inputAmountRadioStation > 0) {
            this.amountRadioStation = inputAmountRadioStation;
        } else {
            this.amountRadioStation = 1;
        }

        this.firstRadioStation = 0;
        this.lastRadioStation = amountRadioStation - 1;
        this.radioStation = firstRadioStation;
    }

    public Radio() {
        this.amountRadioStation = 10;
        this.firstRadioStation = 0;
        this.lastRadioStation = amountRadioStation - 1;
        this.radioStation = firstRadioStation;
    }

    public int getCurrentRadioStation() {
        return radioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void next() {
        if (radioStation == lastRadioStation) {
            radioStation = firstRadioStation;
        } else {
            radioStation++;
        }
    }

    public void prev() {
        if (radioStation == firstRadioStation) {
            radioStation = lastRadioStation;
        } else {
            radioStation--;
        }
    }

    public void setRadioStation(int numberRadioStation) {
        if (numberRadioStation > lastRadioStation || numberRadioStation < firstRadioStation) {
            return;
        }
        radioStation = numberRadioStation;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume--;
        }
    }

    public void setSoundVolume(int numberSoundVolume) {
        if (numberSoundVolume > 100 || numberSoundVolume < 0) {
            return;
        }
        soundVolume = numberSoundVolume;
    }
}
