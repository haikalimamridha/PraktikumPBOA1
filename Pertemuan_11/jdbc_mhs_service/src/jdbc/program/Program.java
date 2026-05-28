/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author ThinkPad
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args){
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        
//        Mahasiswa mhsAdd = new Mahasiswa(5, "mas rusdi rek");
//        service.add(mhsAdd);
//        displayAll();
        
//        Mahasiswa mhsUpdate = service.getById(5);
//        mhsUpdate.setNama("mas rusdi");
//        service.update(mhsUpdate);
//        displayAll();
        
//        service.delete(5);
//        displayAll();
    }
    
    public static void displayAll() {

        List<Mahasiswa> listmhs = service.getAll();

        for (Mahasiswa mhs : listmhs) {
            System.out.println(
                "Mahasiswa{id=" + mhs.getId() + ", nama = " +
                mhs.getNama() + "}"
            );
        }
    }
}
