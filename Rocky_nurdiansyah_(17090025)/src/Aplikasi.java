import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import model.SuratKeluar;
import Service.SuratKeluarService;

/**
 *
 * @author rocky 
 */
public class Aplikasi {
    private static Scanner scanner;
    private static SuratKeluarService service;
    
    public static void main(String[] args) {
        boolean var1 = false;
        scanner = new Scanner(System.in);
        service = new SuratKeluarService();

        int var2;
        do {
            cetakMenu();
            var2 = scanner.nextInt();
            switch(var2) {
            case 1:
                modulAdd();
                break;
            case 2:
                ubahData();
                break;
            case 3:
                hapusData();
                break;
            case 4:
                tampilData();
            }
        } while(var2 != 0);
    }
    
    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("\tAPLIKASI SURAT KELUAR");
        System.out.println("====================================");
        System.out.println("\t1. Tambah Data");
        System.out.println("\t2. Ubah Data");
        System.out.println("\t3. Hapus Data");
        System.out.println("\t4. Tampilkan data");
        System.out.println("------------------------------------");
        System.out.println("\t0. KELUAR");
        System.out.println("====================================");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        System.out.println("--- tambah data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        String var0 = scanner.nextLine();
        System.out.print("hal : ");
        String var1 = scanner.nextLine();
        System.out.print("tanggal_keluar : ");
        String var2 = scanner.nextLine();
        System.out.print("alamat : ");
        String var3 = scanner.nextLine();
        service.addData(new SuratKeluar(var0, var1, var2, var3));
    }

    private static void tampilData() {
        LinkedList var0 = (LinkedList)service.getAllData();
        int var1 = 1;
        Iterator var2 = var0.iterator();

        while(var2.hasNext()) {
            SuratKeluar var3 = (SuratKeluar)var2.next();
            System.out.println("Data ke " + var1++);
            System.out.println("-------------");
            System.out.println(var3.getNomor());
            System.out.println(var3.getHal());
            System.out.println(var3.getTanggal_keluar());
            System.out.println(var3.getAlamat());
        }

    }

    private static void ubahData() {
        System.out.println("--- perubahan data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        String var0 = scanner.nextLine();
        System.out.print("hal : ");
        String var1 = scanner.nextLine();
        System.out.print("tanggal_keluar : ");
        String var2 = scanner.nextLine();
        System.out.print("alamat : ");
        String var3 = scanner.nextLine();
        service.updateData(new SuratKeluar(var0, var1, var2, var3));
    }

    private static void hapusData() {
        System.out.println("--- hapus data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        String var0 = scanner.nextLine();
        service.deleteData(new SuratKeluar(var0, (String)null, (String)null, (String)null));
    }
    
}