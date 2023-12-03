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
    public void testSetRadioStationWithoutConstructorParameters(int numberRadioStation, int expected) {
        Radio radio = new Radio();

        radio.setRadioStation(numberRadioStation);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetterRadioStationWithoutConstructorParameters() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getFirstRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
        Assertions.assertEquals(10, radio.getAmountRadioStation());
        Assertions.assertEquals(9, radio.getLastRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/getterRadioStationWithParameters.csv")
    public void testGetterRadioStationWithConstructorParameters(int inputAmountRadioStation, int expectedFirstAndCurrentStation, int expectedAmountStations, int expectedLastStation) {
        Radio radio = new Radio(inputAmountRadioStation);

        Assertions.assertEquals(expectedFirstAndCurrentStation, radio.getFirstRadioStation());
        Assertions.assertEquals(expectedFirstAndCurrentStation, radio.getCurrentRadioStation());
        Assertions.assertEquals(expectedAmountStations, radio.getAmountRadioStation());
        Assertions.assertEquals(expectedLastStation, radio.getLastRadioStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setRadioStationWithParameters.csv")
    public void testSetRadioStationWithConstructorParameters(int inputAmountRadioStation, int numberRadioStation, int expected) {
        Radio radio = new Radio(inputAmountRadioStation);

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
