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
class Pertama {
private int a = 10;

protected void terprotek()
{
    System.out.println("Method ini hanya untuk anaknya");
}
 public void info()
 {
     System.out.println("a = " + a);
     System.out.println("Dipanggil pada = " + this.getClass().getName());
 }}

 class Kedua extends Pertama{
      private int b = 8;
        
  protected void BacaSuper(){
      System.out.println("b = " + b);
      terprotek ();
      info ();
  }
  }
  class TestPertamaKedua
  {
       public static void main(String [] args)
       {
        Kedua D2 = new Kedua();
        D2.BacaSuper ();
        D2.info();
        
        Pertama S1 = new Pertama();
        S1.terprotek();
        S1.info();
    }
  }
    

