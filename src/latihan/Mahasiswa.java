package latihan;

public class Mahasiswa implements Training, Scholarship {

    private String nim;
    private String nama;
    private String kelas;
    private double ipk;

    private String prodi;
    private int semester;
    private int ijin;


    public Mahasiswa(String nim, String nama, String kelas, double ipk, String prodi, int semester, int ijin) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
        this.prodi = prodi;
        this.semester = semester;
        this.ijin = ijin;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getIjin() {
        return ijin;
    }

    public void setIjin(int ijin) {
        this.ijin = ijin;
    }

    @Override
    public boolean ableTojoin() {
        if (ipk > 3.0 && semester < 8){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int orientation(String hari) {
        if (hari.toLowerCase() == "senin" || hari.toLowerCase() == "selasa" || hari.toLowerCase() == "rabu" || hari.toLowerCase() == "kamis" || hari.toLowerCase() == "jumat" ){
            return ijin + 1;
        }
        else{
            return ijin;
        }
    }

    @Override
    public int nominal() {
        if (ipk == 4.0){
          return 2000000;
        } else if (ipk > 3.5){
            return 1000000;
        }
        return 0;
    }

    @Override
    public boolean canApplyScholarship() {
        if (ipk > 3.5){
            return true;
        }else{
            return false;
        }
    }
}
