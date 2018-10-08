

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Hasil Login Dengan Menggunakan Konsep OOP
 */
package pb03.pkg10117110.latihan33.login;



import java.util.Scanner;


public class PB0310117110Latihan33Login {
    private static String usName,passWord;
    


    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan Username = ");
        usName = scan.next();
        System.out.print("Masukan Pasword = ");
        passWord = scan.next();
        
        User obj = new User();
        obj.pengecekkanLogin(usName, passWord);
        

    }
    
}
