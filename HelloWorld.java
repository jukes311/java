/* HelloWorld.java
 */

public class HelloWorld
{
	public static void main(String[] args) {
		Answerable phone = () -> "Hello";
		System.out.println(phone.answer());
	}
}