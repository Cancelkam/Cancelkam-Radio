package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxVolume());
        radio.nextStation();
        assertEquals(radio.getMinVolume(),radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMinVolume());
        radio.prevStation();
        assertEquals(radio.getMaxVolume(),radio.getCurrentStation());
        radio.prevStation();
        assertEquals(8,radio.getCurrentStation());
    }
}