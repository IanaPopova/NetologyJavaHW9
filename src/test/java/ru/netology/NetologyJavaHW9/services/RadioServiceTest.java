package ru.netology.NetologyJavaHW9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {

    @Test

    public void shouldSetCurrentStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(8);

        int expected = 8;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetMaxStation() {
        RadioService service = new RadioService();

        service.setMaxStation(9);

        int expected = 9;
        int actual = service.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetMinStation() {
        RadioService service = new RadioService();

        service.setMinStation(0);

        int expected = 0;
        int actual = service.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldChangeToNextStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(6);
        service.setNextStation(7);

        int expected = 7;
        int actual = service.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToPrevStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(7);
        service.setPrevStation(6);

        int expected = 6;
        int actual = service.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToPrevStationIfMaxStation() {
        RadioService service = new RadioService();

        service.setMaxStation(9);
        service.setCurrentStation(9);
        service.setPrevStation(8);

        int expected = 8;
        int actual = service.getPrevStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeToNextStationIfLessThanMax() {
        RadioService service = new RadioService();

        service.setMaxStation(9);
        service.setCurrentStation(8);
        service.setNextStation(9);

        int expected = 9;
        int actual = service.getNextStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldMakeStationsGoRoundIfMax() {
        RadioService service = new RadioService();

        service.setCurrentStation(10);
        service.setMinStation(0);

        int expected = 0;
        int actual = service.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMakeStationsGoRoundIfMin() {
        RadioService service = new RadioService();

        service.setCurrentStation(0);
        service.setMaxStation(9);

        int expected = 9;
        int actual = service.getMaxStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetCurrentVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(89);

        int expected = 89;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentVolumeIfEqualsMin() {
        RadioService service = new RadioService();

        service.setMinVolume(0);
        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void volumeStopsAtMax() {
        RadioService service = new RadioService();

        service.setMaxVolume(100);
        service.setCurrentVolume(101);


        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void volumeStopsAtMin() {
        RadioService service = new RadioService();

        service.setMinVolume(0);
        service.setCurrentVolume(-2);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldChangeVolumeUp() {
        RadioService service = new RadioService();

        service.setMaxVolume(100);
        service.setCurrentVolume(99);
        service.setIncreasedVolume(100);

        int expected = 100;
        int actual = service.getIncreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeDown() {
        RadioService service = new RadioService();

        service.setMaxVolume(100);
        service.setCurrentVolume(100);
        service.setDecreasedVolume(99);

        int expected = 99;
        int actual = service.getDecreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeDownIfLessThanMax() {
        RadioService service = new RadioService();

        service.setMaxVolume(100);
        service.setCurrentVolume(101);
        service.setDecreasedVolume(100);

        int expected = 100;
        int actual = service.getDecreasedVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMax() {
        RadioService service = new RadioService();

        service.setCurrentVolume(99);
        service.setMaxVolume(100);

        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMin() {
        RadioService service = new RadioService();

        service.setCurrentVolume(1);
        service.setMinVolume(0);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMinIfMin() {
        RadioService service = new RadioService();

        service.setMaxVolume(100);
        service.setMinVolume(0);
        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMinIfOverMin() {
        RadioService service = new RadioService();

        service.setCurrentVolume(-2);
        service.setMinVolume(0);

        int expected = 0;
        int actual = service.getMinVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMaxIfMax() {
        RadioService service = new RadioService();

        service.setCurrentVolume(100);
        service.setMaxVolume(100);

        int expected = 100;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldChangeVolumeToMaxIfOverMax() {
        RadioService service = new RadioService();

        service.setCurrentVolume(101);
        service.setMaxVolume(100);

        int expected = 0;
        int actual = service.getMaxVolume();

        Assertions.assertEquals(expected, actual);

    }

}



