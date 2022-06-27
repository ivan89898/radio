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
        rad.next(7);
        int expected = 8;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationNine() {
        Radio rad = new Radio();
        rad.next(9);
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationZero() {
        Radio rad = new Radio();
        rad.next(0);
        int expected = 1;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldNextStationMinus() {
        Radio rad = new Radio();
        rad.next(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.prev(7);
        int expected = 6;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationZero() {
        Radio rad = new Radio();
        rad.prev(0);
        int expected = 9;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldPrevStationNine() {
        Radio rad = new Radio();
        rad.prev(9);
        int expected = 8;
        int actual = rad.getCurrentStation();
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume(7);
        int expected = 8;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeTen() {
        Radio rad = new Radio();
        rad.increaseVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeTwenty() {
        Radio rad = new Radio();
        rad.increaseVolume(12);
        int expected = 10;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldIncreaseVolumeZero() {
        Radio rad = new Radio();
        rad.increaseVolume(0);
        int expected = 1;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.decreaseVolume(6);
        int expected = 5;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolumeZero() {
        Radio rad = new Radio();
        rad.decreaseVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolumeMinus() {
        Radio rad = new Radio();
        rad.decreaseVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
    }
}
