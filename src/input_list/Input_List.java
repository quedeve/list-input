/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Input_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> namaCustomer = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah nama : ");
        int jumlahNama = input.nextInt();
        for (int i = 1; i <= jumlahNama; i++) {
            System.out.print("Nama "+ i+" : ");
            namaCustomer.add(input.next());
        }
        System.out.println("Nama yang ada di daftar : " +namaCustomer);
    } 
    
}
