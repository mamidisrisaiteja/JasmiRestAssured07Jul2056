package polyDemo2;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentAnimal pa=new ParentAnimal();
ChildCat c1=new ChildCat();
ParentAnimal pa1=new ChildCat();

pa.eat();
pa.move();
pa.sound();
c1.family();
c1.eat();
c1.sound();
c1.move();
pa1.eat();
pa1.sound();
pa1.move();
pa1.breathe();



	}

}
