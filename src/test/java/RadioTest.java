import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadioStation.csv")
    public void testNext(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.radioStation = radioStation;

        radio.next();

        int actual = radio.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevRadioStation.csv")
    public void testPrev(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.radioStation = radioStation;

        radio.prev();

        int actual = radio.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadioStation.csv")
    public void testSetRadioStation(int numberRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setRadioStation(numberRadioStation);

        int actual = radio.radioStation;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseSoundVolume")
    public void testIncreaseSoundVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.soundVolume = soundVolume;

        radio.increaseSoundVolume();

        int actual = radio.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreaseSoundVolume")
    public void testDecreaseSoundVolume(int soundVolume, int expected) {
        Radio radio = new Radio();
        radio.soundVolume = soundVolume;

        radio.decreaseSoundVolume();

        int actual = radio.soundVolume;

        Assertions.assertEquals(expected, actual);
    }
}
