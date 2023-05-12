package latihan;

import java.util.ArrayList;
import java.util.Arrays;

public class Dosen extends Pegawai implements Training, Scholarship {

    private double edom;
    private String jabatanStruktural;
    private int jmlBimbinganDpa;

    private ArrayList<String> mataKuliah;

    public Dosen(String nip, int gaji, String nama, String departemen, int tahunMengabdi, int totalCuti, double edom, int jmlBimbinganDpa, ArrayList mataKuliah) {
        super(nip, gaji, nama, departemen, tahunMengabdi, totalCuti);
        this.edom = edom;
        this.jmlBimbinganDpa = jmlBimbinganDpa;
        this.mataKuliah = mataKuliah;
    }

    public double getEdom() {
        return edom;
    }

    public void setEdom(double edom) {
        this.edom = edom;
    }


    public String getJabatanStruktural() {
        return jabatanStruktural;
    }

    public void setJabatanStruktural(String jabatanStruktural) {
        this.jabatanStruktural = jabatanStruktural;
    }

    public int getJmlBimbinganDpa() {
        return jmlBimbinganDpa;
    }

    public void setJmlBimbinganDpa(int jmlBimbinganDpa) {
        this.jmlBimbinganDpa = jmlBimbinganDpa;
    }

    public ArrayList<String> getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(ArrayList<String> mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public boolean ableTojoin() {
        if (jabatanStruktural == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int orientation(String hari) {
        if (hari.toLowerCase() == "minggu"  || hari.toLowerCase() == "sabtu"){
            return super.getTotalCuti() + 1;
        }
        else{
            return super.getTotalCuti();
        }
    }

    @Override
    public int nominal() {
        return mataKuliah.size() * 1000000;
    }

    @Override
    public boolean canApplyScholarship() {
        if (edom > 3.5){
            return true;
        }else{
            return false;
        }
    }
}
