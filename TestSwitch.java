public class TestSwitch {
	public static void main(String[] args) {
		
		String language;
		int option = 2; // Citim de la tastatura
		char ch = 'c';
		switch(option) {
			case 1: {
				language = "RO";
				break;
			}
			case 2: {
				language = "RU";
				break;
			}
			case 3:{
				language = "EN";
				break;
			}
			default: {
				language = "ERROR";
				break;
			}
		}
		System.out.println(language);

		
	}
}