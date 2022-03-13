/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///Dewa Arjuna 13002204031
package jobs;
//Dewa Arjuna 13002204031
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;
//Dewa Arjuna 13002204031
public class Artist {
    private String name;
    private Date birthdate;
    private int age;
    
    public Artist(){}
    public Artist(String name, String _birthdate){
        this.name = name;
        SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
        try{
            birthdate = convert.parse(_birthdate);
        }//Dewa Arjuna 13002204031
        catch(Exception ex){
            System.out.println("Format salah");
        }//Dewa Arjuna 13002204031
        int lahir = birthdate.getYear() + 1900;
        LocalDate current = LocalDate.now();
        int now = current.getYear();
        age = now-lahir;
    }//Dewa Arjuna 13002204031
    //Dewa Arjuna 13002204031
    public void setName(String nama){
        name = nama;
    }
    public void setBirthdate(Date tanggal){
        birthdate = tanggal;
    }//Dewa Arjuna 13002204031
    public void setAge(int umur){
        age = umur;
    }//Dewa Arjuna 13002204031
    public String getName(){
        return name;
    }//Dewa Arjuna 13002204031
    public String getBirthdate(){
        String[] daftarBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        //Dewa Arjuna 13002204031
        String tanggal = Integer.toString(birthdate.getDate());
        String tahun = Integer.toString(birthdate.getYear()+1900);
        String bulan = Integer.toString(birthdate.getMonth());
        for(int i = 0; i<12;i++){
            if(i == birthdate.getMonth()){
                bulan = daftarBulan[i];
                break;
            }
        }
        return tanggal + " " + bulan + " " + tahun;
    }//Dewa Arjuna 13002204031
    public int getAge(){
        return age;
    }//Dewa Arjuna 13002204031
    public void displayInfo(){//Dewa Arjuna 13002204031
        System.out.println("Artist name : "+name);
        System.out.println("Birthdate   : "+getBirthdate());
        System.out.println("Age         : "+age);
        System.out.println();
    }//Dewa Arjuna 13002204031
}//Dewa Arjuna 13002204031