/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arts;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import jobs.Artist;
//Dewa Arjuna 13002204031
public class Song {
    private String title;
    private Artist artist;
    private Date release;
    //Dewa Arjuna 13002204031
    public Song(){}
    public Song(String title, Artist artist, String _release){
        this.title = title;
        this.artist = artist;
        SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
        try{
            release = convert.parse(_release);
        }//Dewa Arjuna 13002204031
        catch(Exception ex){
            System.out.println("Format salah");
        }
    }
    //Dewa Arjuna 13002204031
    public void setTitle(String judul){
        title = judul;
    }
    public void setArtist(Artist artis){
        artist = artis;
    }
    public void setRelease(Date tanggal){
        release = tanggal;
    }//Dewa Arjuna 13002204031
    public String getTitle(){
        return title;
    }
    public Artist getArtist(){
        return artist;
    }
    public Date getRelease(){
        return release;
    }//Dewa Arjuna 13002204031
    public void displayInfo(){
        String tglRilis;
        String[] daftarBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        //Dewa Arjuna 13002204031
        String tanggal = Integer.toString(release.getDate());
        int thnRilis = release.getYear()+1900;
        String tahun = Integer.toString(thnRilis);
        String bulan = Integer.toString(release.getMonth());
        for(int i = 0; i<12;i++){
            if(i == release.getMonth()){
                bulan = daftarBulan[i];
                break;
            }
        }//Dewa Arjuna 13002204031
        tglRilis = tanggal + " " + bulan + " " + tahun;
        LocalDate current = LocalDate.now();
        int now = current.getYear();
        int umur = artist.getAge() - (now-thnRilis);
        //int lahir = artist.birthdate.getYear()+1900;
        System.out.println("Title   :" + title);
        System.out.println("Artist  :" + artist.getName());
        System.out.println("Release :" + tglRilis);
        System.out.println("Artist age is " + umur + " when song released");
        System.out.println();
    }
}//Dewa Arjuna 13002204031
