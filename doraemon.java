import java.util.ArrayList;

public class doraemon {
    public static void main(String[] args){
        //membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        //mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        //menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");

        //menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);

        //menampilkan banyak isi kantong ajaib
        System.out.println("kantong ajaib berisi "+kantongAjaib.size()+" item");
    }
}
