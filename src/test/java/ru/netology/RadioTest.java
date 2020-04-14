package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9,radio.getCurrentStation());
        radio.prevStation();
        assertEquals(8,radio.getCurrentStation());
    }
}