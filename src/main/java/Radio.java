public class Radio {
    private int radioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return radioStation;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void next() {
        if (radioStation == 9) {
            radioStation = 0;
        } else radioStation++;
    }

    public void prev() {
        if (radioStation == 0) {
            radioStation = 9;
        } else radioStation--;
    }

    public void setRadioStation(int numberRadioStation) {
        if (numberRadioStation > 9) {
            return;
        }
        radioStation = numberRadioStation;
    }

    public void increaseSoundVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }

    public void setSoundVolume(int numberSoundVolume) {
        soundVolume = numberSoundVolume;
    }
}
