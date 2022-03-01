package Test;

import abstractClassTest.Animal;
import abstractClassTestApp.AnimalAdapter;
import abstractClassTestApp.Cat;
import abstractClassTestApp.Fish;
import abstractClassTestApp.Lion;
import abstractClassTestApp.Person;

public class TestRuntime {
public static void main(String[] args) {
	Person xiaocui=new Person();
	Animal cat=new Cat();
//	xiaocui.raiseCat(cat);
	Animal lion=new Lion();
	//xiaocui.raiseLion(lion);
	Animal fish=new Fish();
	xiaocui.raisePet(cat);
}
}
