package inheritance;

class MyFirstClass{
	void display() {
		MyFirstClass mob=new MyFirstClass(); //having an object is called has-A relation
		//System.out.println("private can be accessed "+mob.pri); //another calss private is hidden
		/*System.out.println("public can be accessed "+mob.pubj);
		System.out.println("protected can be accessed "+mob.protk);
		System.out.println("default can be accessed "+mob.dfm);*/
	}
}

class MyExtendedClass extends MyFirstClass{ //extending is called IS-A relation
	void extendedDisplay() {
		//MyFirstClass mob=new MyFirstClass();
		//no need object creation 
		//public ,default and protected directly inherited
		//System.out.println("private can be accessed "+mob.pri); //another calss private is hidden
		System.out.println("public can be accessed ");
		System.out.println("protected can be accessed ");
		System.out.println();
class InheritanceClass {

	public static void main(String[] args) {
		//IndependentClass ob=new IndependentClass();
		//ob.display();
		MyExtendedClass ob1=new MyExtendedClass();
		ob1.extendedDisplay();
	}
}
	}
}