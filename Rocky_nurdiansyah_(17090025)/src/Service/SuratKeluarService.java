package Service;

import java.util.LinkedList;
import java.util.List;
import model.SuratKeluar;

/**
 *
 * @author rocky
 */
public class SuratKeluarService {
    private static List<SuratKeluar> data = new LinkedList();

    public SuratKeluarService() {
    }

    public void addData(SuratKeluar var1) {
        data.add(var1);
        System.out.println("data telah tersimpan");
    }

    public void updateData(SuratKeluar var1) {
        int var2 = data.indexOf(var1);
        if (var2 >= 0) {
            data.set(var2, var1);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }

    }

    public void deleteData(SuratKeluar var1) {
        int var2 = data.indexOf(var1);
        if (var2 >= 0) {
            data.remove(var2);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }

    }

    public List<SuratKeluar> getAllData() {
        return data;
    }
}
