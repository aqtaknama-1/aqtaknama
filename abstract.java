abstract class Keterangan {
    public void sehat(){
        System.out.println("Makanan ini sehat");
    }
    public void tidak_sehat(){
        System.out.println("Makanan ini tidak sehat");
    }
}

class Bakso extends Keterangan {}

class Main {
    public static void main(String args[]) {
        Bakso b = new Bakso();
        b.sehat();
    }
}
