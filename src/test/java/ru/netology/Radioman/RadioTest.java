package ru.netology.Radioman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(7);
        station.nextChannel();
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void prevChannelFromMin() {
        //предыдущий канал с минимального значения
        Radio station = new Radio();
        station.setCurrentChannel(0);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //предыдущий канал с многозначного значения
    public void prevChannelFromAnyValue() {
        Radio station = new Radio();
        station.setCurrentChannel(320);
        station.prevChannel();
        assertEquals(8, station.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMax() {
        //следующий канал после максимального
        Radio station = new Radio();
        station.setCurrentChannel(9);
        station.nextChannel();
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    //следующий канал после многозначного номера
    public void nextChannelMulti() {
        Radio station = new Radio();
        station.setCurrentChannel(120);
        station.nextChannel();
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    public void setChannel() {
        Radio station = new Radio();
        station.setCurrentChannel(2);
        assertEquals(2, station.getCurrentChannel());
    }

    @Test
    //ввести многозначные номера каналов
    public void setChannelAny() {
        Radio station = new Radio();
        station.setCurrentChannel(35);
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //следующий канал после многозначного отрицательного значения
    public void nextChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-520);
        station.nextChannel();
        assertEquals(1, station.getCurrentChannel());
    }

    @Test
    //предыдущий канал после многозначного отрицательного значения
    public void prevChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-320);
        station.prevChannel();
        assertEquals(9, station.getCurrentChannel());
    }

    @Test
    //ввести многозначные отрицательные номера каналов
    public void setChannelMinus() {
        Radio station = new Radio();
        station.setCurrentChannel(-20);
        assertEquals(0, station.getCurrentChannel());
    }

    @Test
    void increaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(9);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(1);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromAnyVolume() {
        //увеличить громкость с любого значения до максимального
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromAnyVolume() {
        //уменьшить громкость с любого многозначного значения
        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.decreaseVolume();
        assertEquals(9, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMin() {
        //уменьшить громкость с минимального значения
        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    void increaseVolumeFromMax() {
        //увеличить громкость с максимального значения
        Radio station = new Radio();
        station.setCurrentVolume(10);
        station.increaseVolume();
        assertEquals(10, station.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromAnyMinus() {
        //уменьшить громкость с любого отрицательного значения
        Radio station = new Radio();
        station.setCurrentVolume(-100);
        station.decreaseVolume();
        assertEquals(0, station.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromAnyMinus() {
        //увеличить громкость с любого отрицательного значения
        Radio station = new Radio();
        station.setCurrentVolume(-100);
        station.increaseVolume();
        assertEquals(1, station.getCurrentVolume());
    }
}


