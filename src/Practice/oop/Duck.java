/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

/**
 *
 * @author hp
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;   
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
    abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void swin() {
        System.out.println("All ducks float, even decoys!");
       
    }
    
}
