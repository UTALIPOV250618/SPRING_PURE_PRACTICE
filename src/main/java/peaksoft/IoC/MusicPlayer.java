package peaksoft.IoC;

import peaksoft.testbean.Music;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    }
    public void setMusic(Music music){
        this.music = music;
    }


    public void playMusic(){
        System.out.println("Playing..."+music.getSong());
    }
}
