/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author MPC
 */
 class guru 
{
private int id_guru;
private String nama_guru;

public guru(int id_guru,String nama_guru)
{
   this.id_guru = id_guru;
   this.nama_guru = nama_guru;
}

public void tampilkan()
{
System.out.println("Id guru   : " +this.id_guru);
System.out.println("Nama guru : " +this.nama_guru);
}

}
class Mapel extends guru
{
    private String pelajaran;
    
    public Mapel (String pelajaran,int id_guru,String nama_guru)
    {
      super(id_guru,nama_guru);
      this.pelajaran = pelajaran;
    }
     public void tampilkan(){
        System.out.println("Mengajar  : " + this.pelajaran);
        super.tampilkan();
    }
}
 class perpustakaan extends Mapel{
    private int no_buku;
    private String buku;
    
    public perpustakaan(int no_buku,String buku,String pelajaran,int id_guru,String nama_guru){
        super(pelajaran,id_guru,nama_guru);
        this.no_buku = no_buku;
        this.buku=buku;
    }
    public void tampilkan(){
        super.tampilkan();
        System.out.println("No.buku   : " +this.no_buku);
        System.out.println("Nama buku : " +this.buku);
    }

   
}
