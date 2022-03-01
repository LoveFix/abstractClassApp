package abstractClassTestApp;

import abstractClassTest.Animal;

public class Person {
private String name;
public void raiseLion(Lion lion) {
	System.out.println("养狮子");
	lion.run();
}

public void raiseFish(Fish fish) {
	System.out.println("养鱼");
	fish.run();
}

public void raiseCat(Cat cat) {
	System.out.println("养猫");
	cat.run();
	cat.eat();
}
/**
 * 运行时才决定pet参数是什么对象
 * @param pet
 */
public void raisePet(Animal pet) {
	pet.run();
}
}
