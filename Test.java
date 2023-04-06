public class Test {
	public static void main(String[] args) {
		
		int x = -10;
		if(x > 0) {
			System.out.println("Acest numar este mai mare decat 0");
			System.out.println("--- Executam logica ---");
		} else if(x > -200) {
			System.out.println("Acest numar este mai mare decat -200");
		} else {
			System.out.println("Acest numar este mai mic decat -200");
		}
	}
}