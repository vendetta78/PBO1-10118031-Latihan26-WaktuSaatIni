
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu saat ini
 */
public class WaktuSaatIni {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String waktu = date.format(dateFormatted);
        System.out.println("Waktu saat ini adalah : " + waktu);
    }

}
