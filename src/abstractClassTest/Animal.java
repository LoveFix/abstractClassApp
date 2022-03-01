package abstractClassTest;
/**
 * 定义更高层次的抽象组件类，从而可以在被继承时而根据实际子类应用场景继续功能实现
 * 
 * @author 七凉
 *
 */
public abstract class Animal {
   public abstract void run();
   //抽象类中允许定义抽象方法也可以定义非抽象方法
  //修饰符不能是private 
   public abstract void eat();
   public abstract void hunting();
} 
