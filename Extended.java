class Makanan{
    void jenis(){
        System.out.print("Makanan ");
    }
}
class Panggang extends Makanan{
    void subjenis(){
        System.out.print("Panggang ");
    }
}
class Sate extends Panggang{
    int harga = 15000;
    void nama(){
        System.out.println(": Sate");
        System.out.println("Harga   : " + this.harga);
    }
}

class Test{
    public static void main(String args[]){
        Sate food=new Sate();
        food.jenis();
        food.subjenis();
        food.nama();
    
    }
}
        





// Tugas
// Buat inheretansi minimal 2 level
// Alamat Email : agung.cahyawan@unud.ac.id 
// Subject G5H-DR3-NIM

// Cover Nama mata kuliah
// Judul Tugas
// Logo Unud
// Nama
// Nim
// Jurusan

//Capturenya pake mode terangn
