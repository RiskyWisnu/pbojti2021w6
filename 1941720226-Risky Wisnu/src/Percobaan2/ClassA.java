/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Risky
 */
public class ClassA {
    private int x;
    private int y;
    
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void getNilai(){
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
    }
}
