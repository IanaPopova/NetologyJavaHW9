package ru.netology.NetologyJavaHW9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    RadioService radio = new RadioService(9);

    @Test

    public void constructorTest() {
        RadioService radio = new RadioService();
    }

    @Test
    public void amountOfStations() {
        RadioService radio = new RadioService(9);

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void settingOriginStations() {
        RadioService radio = new RadioService(9);

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldSetCurrentVolume() {

        radio.setCurrentVolume(68);

        int expected = 68;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMax() {

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeToMin() {

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSIncreaseVolume() {

        radio.setCurrentVolume(99);
        radio.setToIncreasedVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSDecreaseVolume() {

        radio.setCurrentVolume(1);
        radio.setToDecreasedVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeAboveMax() {

        radio.setCurrentVolume(102);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeBelowMin() {

        radio.setCurrentVolume(-3);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationToMin() {

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentStationToMax() {

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToMaxStation() {

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMinStation() {

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToNextStation() {

        radio.setCurrentStation(8);
        radio.setToNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMinStationIfAboveMax() {

        radio.setCurrentStation(10);
        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToPrevStation() {

        radio.setCurrentStation(1);
        radio.setToPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMaxStationIfBelowMin() {

        radio.setCurrentStation(-1);
        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}




