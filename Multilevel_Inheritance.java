
class Animal2{
	public void eat() {
		System.out.println("eating");
	}
}
class Dogs extends Animal2{
	public void bark() {
		System.out.println("barking");
	}
}
class BabyDog extends Dogs{
	public void weep() {
		System.out.println("weeping");
	}
}
public class Multilevel_Inheritance {
	public static void main(String args[]) {
		BabyDog bg=new BabyDog();
		bg.weep();
		bg.bark();
		bg.eat();
		
	}

}
