
abstract class AbstractClass {

	public void TemplateMethod() {
		Method1();
		Method2();
		if(isMethod3()) {
			Method3();
		}
		Method4();
	}
	
	public void Method1() {
		System.out.print("AbstractClass Method1!\n");
	}
	
	abstract void Method2();
	
	public void Method3() {
		System.out.print("AbstractClass Method3!\n");
	}
	
	public Boolean isMethod3() {
		return true;
	}
	
	public void Method4() {
		System.out.print("AbstractClass Method4!\n");
	}
}
