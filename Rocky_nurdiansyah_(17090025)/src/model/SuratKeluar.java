package model;

/**
 *
 * @author rocky
 */
public class SuratKeluar {
    private String nomor;
    private String hal;
    private String tanggal_keluar;
    private String alamat;

    public SuratKeluar() {
    }

    public SuratKeluar(String var1, String var2, String var3, String var4) {
        this.nomor = var1;
        this.hal = var2;
        this.tanggal_keluar = var3;
        this.alamat = var4;
    }

    public boolean equals(Object var1) {
        SuratKeluar var2 = (SuratKeluar)var1;
        return this.nomor.equals(var2.getNomor());
    }

    public String toString() {
        String var10000 = this.nomor;
        String var10001 = this.hal;
        String var10002 = this.tanggal_keluar;
        return this.alamat;
    }

    public void setNomor(String var1) {
        this.nomor = var1;
    }

    public String getNomor() {
        return this.nomor;
    }

    public void setHal(String var1) {
        this.hal = var1;
    }

    public String getHal() {
        return this.hal;
    }

    public void setTanggal_keluar(String var1) {
        this.tanggal_keluar = var1;
    }

    public String getTanggal_keluar() {
        return this.tanggal_keluar;
    }

    public void setAlamat(String var1) {
        this.alamat = var1;
    }

    public String getAlamat() {
        return this.alamat;
    }
}