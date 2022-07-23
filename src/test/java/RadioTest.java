import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationMinus() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationZero() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.next();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationEight() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prev();
        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationTen() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.decreaseVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeHundred() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeHundredOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeHundred() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNinetyNine() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void Volume() {
        Radio rad = new Radio(20, 90);
        rad.setCurrentStation(15);
        rad.setCurrentVolume(80);
        int expected = 80;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void Station() {
        Radio rad = new Radio(20, 90);
        rad.setCurrentStation(15);
        rad.setCurrentVolume(80);
        int expected = 15;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void StationZero() {
        Radio rad = new Radio(20, 90);
        rad.setCurrentStation(20);
        rad.setCurrentVolume(90);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void StationZeroZero() {
        Radio rad = new Radio(0, 90);
        rad.setCurrentStation(0);
        rad.setCurrentVolume(90);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void SetMaxStationUnderTwentyFive() {
        Radio rad = new Radio();
        rad.setMaxStation(25);
        rad.setCurrentStation(24);
        int expected = 24;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void SetMaxStationUpTwentyFive() {
        Radio rad = new Radio();
        rad.setMaxStation(25);
        rad.setCurrentStation(26);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void GetMaxStationHundred() {
        Radio rad = new Radio();
        rad.setMaxStation(100);
        int expected = 100;
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void GetMaxStationHundredOne() {
        Radio rad = new Radio();
        rad.setMaxStation(100);
        int expected = 100;
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void GetMaxStation() {
        Radio rad = new Radio();
        rad.setMaxStation(100);
        rad.setMaxStation(12);
        int expected = 12;
        int actual = rad.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void GetMaxStationThis() {

        int maxStation = 100;

        Radio rad = new Radio(maxStation);
        assertEquals(rad.getMaxStation(), maxStation);
    }
}
