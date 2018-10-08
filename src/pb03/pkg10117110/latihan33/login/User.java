
package pb03.pkg10117110.latihan33.login;

import java.util.Scanner;

public class User {
    private String username,password;
    private boolean statusAkun;
    Scanner scan = new Scanner(System.in);
    
    private boolean cekAkun(String username, String password){
        
    if(username.equalsIgnoreCase("RizkiAdam")&&password.equalsIgnoreCase("terbaikselalu")){
      statusAkun = true;        
    }else{
      statusAkun = false;
            }        
        return statusAkun;
            
        }
    
    private void hasilLogin(boolean statusAkun, String username){
        if(statusAkun==true){
             System.out.println("******"+username+"******");
             System.out.println("Selamat Datang di Aplikasi ini");
            
        }else{
             System.out.println("Ooops, Username atau password anda salah ");
        }      
        
    }

        
    
    
        public void pengecekkanLogin(String username, String password){
            cekAkun(username,password);
            hasilLogin(statusAkun,username);
            

            
            
            
        }
    
    
            
    }   
    
