package ru.netology.NetologyJavaHW9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    RadioService service = new RadioService();

    @Test

    public void shouldSetCurrentStation() {

        service.setCurrentStation(8);

        int expected = 8;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetMaxStation() {


        int expected = 9;
        int actual = service.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMinStation() {


        int expected = 0;
        int actual = service.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldChangeToNextStation() {

        service.setCurrentStation(7);
        service.setNextStation(8);


        int expected = 8;
        int actual = service.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToNextStationIfEqualsMinStation() {

        service.setCurrentStation(0);
        service.setNextStation(1);

        int expected = 1;
        int actual = service.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToPrevStation() {

        service.setCurrentStation(7);
        service.setPrevStation(6);

        int expected = 6;
        int actual = service.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToPrevStationIfMaxStation() {

        service.setCurrentStation(9);
        service.setPrevStation(8);

        int expected = 8;
        int actual = service.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToNextStationIfLessThanMax() {

        service.setCurrentStation(8);
        service.setNextStation(9);

        int expected = 9;
        int actual = service.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldMakeStationsGoRoundIfMax() {

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMakeStationsGoRoundIfMin() {

        service.setCurrentStation(0);

        int expected = 9;
        int actual = service.getMaxStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentVolume() {

        service.setCurrentVolume(89);

        int expected = 89;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeStopsAtMax() {

        service.setMaxVolume(100);
        service.setCurrentVolume(101);

        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeStopsAtMin() {

        service.setMinVolume(0);
        service.setCurrentVolume(-2);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {


        service.setCurrentVolume(45);
        service.setMaxVolume(100);
        service.setIncreasedVolume(46);

        int expected = 46;
        int actual = service.getIncreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotIncreaseVolumeIfMoreThanMax() {

        service.setCurrentVolume(101);
        service.setMaxVolume(100);
        service.setIncreasedVolume(100);

        int expected = 100;
        int actual = service.getIncreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseVolume() {

        service.setMaxVolume(100);
        service.setCurrentVolume(100);
        service.setDecreasedVolume(99);

        int expected = 99;
        int actual = service.getDecreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeDownIfLessThanMax() {

        service.setMaxVolume(100);
        service.setCurrentVolume(101);
        service.setDecreasedVolume(100);

        int expected = 100;
        int actual = service.getDecreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMax() {

        service.setCurrentVolume(99);
        service.setMaxVolume(100);

        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMin() {

        service.setMinVolume(0);
        service.setCurrentVolume(1);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMinIfMin() {

        service.setMaxVolume(100);
        service.setMinVolume(0);
        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMinIfOverMin() {

        service.setCurrentVolume(-2);
        service.setMinVolume(0);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotChangeVolumeToMaxIfOverMax() {

        service.setMaxVolume(100);
        service.setCurrentVolume(101);

        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

}



