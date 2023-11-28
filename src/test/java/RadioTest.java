import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadioStation.csv")
    public void testNext(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);

        radio.next();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevRadioStation.csv")
    public void testPrev(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setRadioStation(radioStation);

        radio.prev();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadioStation.csv")
    public void testSetRadioStation(int numberRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setRadioStation(numberRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseSoundVolume")
    public void testIncreaseSoundVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.setSoundVolume(soundVolume);

        radio.increaseSoundVolume();

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseSoundVolume")
    public void testDecreaseSoundVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.setSoundVolume(soundVolume);

        radio.decreaseSoundVolume();

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setSoundVolume.csv")
    public void testSetSoundVolume(int numberSoundVolume, int expected) {
        Radio radio = new Radio();

        radio.setSoundVolume(numberSoundVolume);

        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
