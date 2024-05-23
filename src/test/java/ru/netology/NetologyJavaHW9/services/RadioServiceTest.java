package ru.netology.NetologyJavaHW9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {

    @Test
    public void shouldSetCurrentVolume() {
        RadioService radio = new RadioService();

        radio.setCurrentVolume(68);

        int expected = 68;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeToMax() {
        RadioService radio = new RadioService();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeToMin() {
        RadioService radio = new RadioService();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSIncreaseVolume() {

        RadioService radio = new RadioService();

        radio.setCurrentVolume(100);
        radio.setToIncreasedVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSIncreaseVolumeIfLessThanMax() {

        RadioService radio = new RadioService();

        radio.setCurrentVolume(89);
        radio.setToIncreasedVolume();

        int expected = 90;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSDecreaseVolume() {

        RadioService radio = new RadioService();

        radio.setCurrentVolume(1);
        radio.setToDecreasedVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSDecreaseVolumeIfMoreThanMin() {

        RadioService radio = new RadioService();

        radio.setCurrentVolume(78);
        radio.setToDecreasedVolume();

        int expected = 77;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeAboveMax() {
        RadioService radio = new RadioService();

        radio.setCurrentVolume(102);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeBelowMin() {
        RadioService radio = new RadioService();

        radio.setCurrentVolume(-3);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        RadioService radio = new RadioService();

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToMaxStation() {
        RadioService radio = new RadioService();

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMinStation() {
        RadioService radio = new RadioService();

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetToNextStation() {
        RadioService radio = new RadioService();

        radio.setCurrentStation(8);
        radio.setToNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToPrevStation() {
        RadioService radio = new RadioService();

        radio.setCurrentStation(1);
        radio.setToPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToMinStationIfMoreThanMax() {
        RadioService radio = new RadioService();

        radio.setCurrentStation(10);
        radio.setMinStationIfAboveMax();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetToPrevStationIfLessThanMin() {
        RadioService radio = new RadioService();

        radio.setCurrentStation(-1);
        radio.setMaxStationIfBelowMin();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}



