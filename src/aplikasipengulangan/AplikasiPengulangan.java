/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasipengulangan;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class AplikasiPengulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputnama = new Scanner(System.in);
        Scanner inputnim = new Scanner(System.in);
        Scanner inputangka = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean running = true;
        String loopingAnswer;
 
        System.out.println("==============================================");
        System.out.println("TK 2-Aplikasi Algoritma Pengulangan-Kelompok 4");
        System.out.println("==============================================");
        System.out.println("Anggota Kelompok: ");
        System.out.println("1. BAYU TIRTA SUKMANA");
        System.out.println("2. CHATLEA CINTA PUTRI WIDYANTO");
        System.out.println("3. FIOREL AL ZAHRA");
        System.out.println("4. YUDHA DWIPRIATMA");
        System.out.println("==============================================");
        System.out.println("");
        
        while (running) {
            System.out.print("Masukkan nama Anda [1..25] : ");
            String name = inputnama.nextLine();
            
            if (name.length() >= 25) {
                System.out.println("Lebih dari 25 Karakter");
            } else {
                System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
                String nim = inputnim.nextLine();
                System.out.println("");
                
                if (nim.length() == 10) {
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("");
                    System.out.println("Registrasi Sukses..");
                    System.out.println("Selamat datang " + name + " [NIM : " + nim + "].. ^.^");
                    System.out.println("");
                    System.out.println("Mari belajar macam-macam deret bilangan..");
 
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("");
                    System.out.print("Masukkan Sembarang Angka [5..20] : ");
                    int angka = inputangka.nextInt();
                    System.out.println("");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    
                    if (angka >= 5 && angka <= 20) {
                        System.out.println("");
                        System.out.println("Deret Bilangan");
                        System.out.println("#################");
                        System.out.println("");
                        System.out.println(angka + " Bilangan Genap :");
                        int counter = 0;
                        int totalgenap = 0;
                        
                        for (int a = 2; true; a += 2) {
                            System.out.print(a + " ");
                            totalgenap += a;
                            counter++;
                            
                            if (counter > (angka - 1)) {
                                break;
                            }
                        }
                        System.out.println("");
                        System.out.println("Hasil Penjumlahan = " + totalgenap);
                        System.out.println("");
                        int hitung = 0;
                        int totalganjil = 0;
                        System.out.println(angka + " Bilangan Ganjil :");
                        
                        for (int a = 1; true; a += 2) {
                            System.out.print(a + " ");
                            totalganjil += a;
                            hitung++;
                            
                            if (hitung > (angka - 1)) {
                                break;
                            }
                        }
                        
                        System.out.println("");
                        System.out.println("Hasil Penjumlahan = " + totalganjil);
                        System.out.println("");
                        System.out.println(angka + " Bilangan Fibbonanci :");
                        int past, current, fibonacci;
                        past = 1;
                        current = 1;
                        fibonacci = 1;
                        int totalfibo = 0;
                        
                        for (int i = 1; i <= angka; i++) {
                            System.out.print(current + " ");
                            totalfibo += current;
                            fibonacci = past + current;
                            past = current;
                            current = fibonacci;
                        }
                        System.out.println("");
                        System.out.println("Hasil Penjumlahan = " + totalfibo);
                        System.out.println("");
                    }
                } else {
                    System.out.print("NIM tidak valid\n");
                }
            }
            
            System.out.print("Anda ingin mengulang [y/t] : ");
            loopingAnswer = input.nextLine();
            
            if (loopingAnswer.equalsIgnoreCase("t")) {
                running = false;
            }
        }
    }
    
}
