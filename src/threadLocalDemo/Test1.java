package threadLocalDemo;

public class Test1 {
	public static ThreadLocal<String> tl = new ThreadLocal<String>();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("为ThreadLocal类对象放入值:aaa");
			tl.set("aaaֵ");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
