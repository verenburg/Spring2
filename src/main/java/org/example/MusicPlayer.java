package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    //Инверсия управления
    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public MusicPlayer() {

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music: this.musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
