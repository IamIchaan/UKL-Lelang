
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ichan
 */
public interface User {
    void setNama(String Nama);
    void setAlamat(String Alamat);
    void setTelepon(String Telepon);
    
    String getNama(int Nama);
    String getAlamat(int Alamat);
    String getTelepon (int Telepon);
}