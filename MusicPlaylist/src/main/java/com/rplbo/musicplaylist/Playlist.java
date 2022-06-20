package com.rplbo.musicplaylist;
import java.util.ArrayList;
public class Playlist {
    private String playlistName;
    private static ArrayList<Song> songs = new ArrayList<Song>(6);
    private static int count;
    public Playlist() {
        ArrayList<Song> songs = new ArrayList<Song>(6);
    }
    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }
    public static void print(){
        System.out.println("jumlah lagu = "+ songs.size()+" /kapasitas Playlist = 6");
        for (int i = 0; i < songs.size(); i++){
            System.out.println("ListSong["+i+"] : "+ songs.get(i).getName()+" - "+songs.get(i).getArtist());
        }
    }
    public void add(Song song){
        if(songs.size() < 6) {
            songs.add(song);
        } else {
            System.out.println("Playlist Favorite penuh!. Tidak bisa menambahkan lagu lagi.");
        }
    }
    public void remove(String songName){
        for (int i = 0; i < songs.size(); i++){
            if(songs.get(i).getName() == songName){
                songs.remove(i);
                System.out.println(songName+" terhapus...");
                break;
            } else {

            }
        }
    }

    public int size(){
        return songs.size();
    }

    public String totalTime() {
        for(int i = 0; i < songs.size(); i++) {
            this.count += songs.get(i).getLength();
        }
        String waktu = String.valueOf(count);
        return "Total waktu ["+getPlaylistName()+"] = "+waktu;
    }
}

