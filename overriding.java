class Makanan {
    public void harga(){
        int harga=10000;
        System.out.println("Harga   : " + harga);
    }
}

class Bakso extends Makanan {
    public void harga(){
        int harga=12000;
        System.out.println("Harga   : " + harga);
    }
}

class coba {
    public static void main(String[] args) {
        Bakso B= new Bakso();
        Makanan M= new Makanan();
        Makanan MB= new Bakso();
        
        B.harga();
        M.harga();
        MB.harga();
    }
}

