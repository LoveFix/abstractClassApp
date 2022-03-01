package abstractClassTest;
/**
 * 抽象子类可以不实现抽象父类的抽象方法，也可以对抽象方法进行实现
 * @author 七凉
 *
 */
public abstract class Mammal extends Animal {
public abstract void lactation();
//在抽象子类中可以继续添加新的抽象方法，也可以添加非抽象方法
}
