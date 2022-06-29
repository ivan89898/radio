import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationMinus() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationZero() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.next();
        int expected = 8;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationTen() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationEleven() {
        Radio rad = new Radio();
        rad.setCurrentStation(11);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationEight() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.next();
        int expected = 9;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.next();
        int expected = 1;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.next();
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prev();
        int expected = 6;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationMinus() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationOne() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prev();
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prev();
        int expected = 8;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationTen() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.prev();
        int expected = 9;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeTen() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeTwenty() {
        Radio rad = new Radio();
        rad.setCurrentVolume(12);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.decreaseVolume();
        int expected = 5;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
    }
}
