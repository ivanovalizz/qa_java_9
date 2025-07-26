package ru.netology.qa_java_9.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test //Тестирует установку значения вручную
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует установку минимального значения
    public void shouldSetStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует установку максимального значения
    public void shouldSetStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует невозможность установки ниже минимального значения
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует невозможность установки выше максимального значения
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения
    public void shouldSetToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для минимального значения
    public void shouldSetToNextStationForMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для максимального значения
    public void shouldSetToNextStationForMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для значения выше максимума
    public void shouldSetToNextStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для значения ниже минимума
    public void shouldSetToNextStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения
    public void shouldSetToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.setToPrevStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для минимального значения
    public void shouldSetToPrevStationForMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для максимального значения
    public void shouldSetToPrevStationForMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setToPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для значения ниже минимума
    public void shouldSetToPrevStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для значения выше максимума
    public void shouldSetToPrevStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test //Тестирует установку значения вручную
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует установку минимального значения
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует установку максимального значения
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует невозможность установки ниже минимального значения
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует невозможность установки выше максимального значения
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует увеличение значения
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        radio.increaseVolume();

        int expected = 16;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для минимального значения
    public void shouldIncreaseVolumeForMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для максимального значения
    public void shouldIncreaseVolumeForMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для значения выше максимума
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение следующего значения для значения ниже минимума
    public void shouldIncreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);

        radio.reduceVolume();

        int expected = 19;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для минимального значения
    public void shouldReduceVolumeForMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для максимального значения
    public void shouldReduceVolumeForMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для значения ниже минимума
    public void shouldReduceVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Тестирует переключение предыдущего значения для значения выше максимума
    public void shouldReduceVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
