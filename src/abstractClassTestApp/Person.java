package abstractClassTestApp;

import abstractClassTest.Animal;

public class Person {
private String name;
public void raiseLion(Lion lion) {
	System.out.println("��ʨ��");
	lion.run();
}

public void raiseFish(Fish fish) {
	System.out.println("����");
	fish.run();
}

public void raiseCat(Cat cat) {
	System.out.println("��è");
	cat.run();
	cat.eat();
}
/**
 * ����ʱ�ž���pet������ʲô����
 * @param pet
 */
public void raisePet(Animal pet) {
	pet.run();
}
}
