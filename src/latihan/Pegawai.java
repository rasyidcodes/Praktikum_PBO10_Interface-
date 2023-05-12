package latihan;

public class Pegawai {

    private String nip;
    private int gaji;
    private String nama;
    private String departemen;
    private int tahunMengabdi;
    private  int totalCuti;

    public Pegawai(String nip, int gaji, String nama, String departemen, int tahunMengabdi, int totalCuti) {
        this.nip = nip;
        this.gaji = gaji;
        this.nama = nama;
        this.departemen = departemen;
        this.tahunMengabdi = tahunMengabdi;
        this.totalCuti = totalCuti;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getTahunMengabdi() {
        return tahunMengabdi;
    }

    public void setTahunMengabdi(int tahunMengabdi) {
        this.tahunMengabdi = tahunMengabdi;
    }

    public int getTotalCuti() {
        return totalCuti;
    }

    public void setTotalCuti(int totalCuti) {
        this.totalCuti = totalCuti;
    }
}
