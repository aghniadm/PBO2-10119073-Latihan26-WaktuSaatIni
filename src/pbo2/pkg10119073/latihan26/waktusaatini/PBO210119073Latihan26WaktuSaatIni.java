package pbo2.pkg10119073.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu yang
 * sesuai dengan lokasi saat ini
 *
 */

public class PBO210119073Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
        String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
        System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+", "
             +formatIndo.format(date));
    }
    
}