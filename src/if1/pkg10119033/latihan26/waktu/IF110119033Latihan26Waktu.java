/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan26.waktu;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi sesuai waktu lokal
 */
public class IF110119033Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String formatWaktu = waktu.format(FormatDate);
        System.out.println("Hari ini adalah hari : ".concat(formatWaktu));   
    }
    
}
