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
class A {
private int a;
public void setA(int nilai){
    a=nilai;
}
public int getA()
{
        return a;
}
public void tampilkanNilai()
{
System.out.println("Nilai a : " +getA());
}
}
class B extends A
{
    private int b;
    public void setB(int nilai){
        b=nilai;
    }
    public int getB(){
        return b;
    }
    public void tampilkanNilai()
    {
        super.tampilkanNilai();
        System.out.println("Nilai b : " + getB());
    }
}
class DemoOverride2
{
    public static void main(String []args){
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        obj.tampilkanNilai();
    }
}