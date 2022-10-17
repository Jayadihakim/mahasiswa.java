@@ -36,6 +36,10 @@ public static void main(String[] args) { System.out.println("==================================="); }

    //print tiap mahasiswa 
    for(int i = 0; i < 4; i++){
        mhs.get(i).infoMahasiswa();
    }
    System.out.println("jumlah mahasiswa : " + mhs.size());
    System.out.print("jumlah mahasiswa yang lulus : ");
    printMhs(lulus);
