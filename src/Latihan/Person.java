/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MPC
 */
 class Person {
    private String nama;
    private int usia;
    
public Person(String nama,int usia)
{
    this.nama = nama;
    this.usia = usia;
}
public void info(){
    System.out.println("Nama :" + this.nama);
    System.out.println("Usia : " + this.usia);
}
}
class Employ extends Person
{
    private String noKaryawan;
    public Employ (String noKaryawan,String nama,int usia)
    {
      super(nama,usia);
      this.noKaryawan = noKaryawan;
    }
    public void info()
    {
    System.out.println("No.Karyawan : " + this.noKaryawan);
    super.info();
    }
    

}
