package latihan;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Mahasiswa rasyid =  new Mahasiswa("505791","Rasyid", "BB", 4.0, "trpl", 5, 0);
//        System.out.println(rasyid.ableTojoin());
//        System.out.println(rasyid.orientation("minggu"));
//        System.out.println(rasyid.canApplyScholarship());
//        System.out.println(rasyid.nominal());

        ArrayList<String> matkul =  new ArrayList<>(Arrays.asList("pbo","ppw","basisdata"));

//        Dosen bureta =  new Dosen("8282828", 8000000, "bu reta", "tedi", 2020, 12, 4.0,true,12, matkul );
        Dosen bureta =  new Dosen("8282828", 8000000, "bu reta", "tedi", 2020, 12, 4.0,12, matkul );
    
        System.out.println(bureta.ableTojoin());
//        System.out.println(bureta.orientation("minggu"));
//        System.out.println(bureta.canApplyScholarship());
//        System.out.println(bureta.nominal());


    }
}