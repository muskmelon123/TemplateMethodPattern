
public class Client {

	public static void main(String args[]) {
		AbstractClass demo = new ConcreteClass();
		demo.TemplateMethod();
	}
}

//注意：模板模式其实就是在把父类的一些行为延迟到子类里面来实现。关于钩子函数：1.通过复写isMethod3()来决定Method3()是否执行。2.也可以复写Method4()，来
//改变Method4()的行为，从而达到子类控制父类的作用。
