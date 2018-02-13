//http://www.codejava.net/java-core/concurrency/understanding-deadlock-livelock-and-starvation-with-code-examples-in-java
import java.util.Scanner;
class Main {
	public static void main(String[] args) {

		int opcja;
		String opcjaString;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1) Deadlock");
		System.out.println("2) Livelock");
		System.out.println("3) Starvation");
		System.out.print("Wybierz opcje: ");

		try {
			opcjaString = scanner.nextLine();		
			opcja = Integer.parseInt(opcjaString);
		

			if(opcja == 1) {
				DeadlockMain deadlockMain = new DeadlockMain();
				deadlockMain.deadRun();
			}
			else if(opcja == 2) {
				LivelockMain livelockMain = new LivelockMain();
				livelockMain.liveRun();
			}
			else if(opcja == 3) {
				StarvationMain starvationMain = new StarvationMain();
				starvationMain.starRun();
			
			}
			else {
				System.out.println("Podano niepoprawna opcje.");				
			}

		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Podano niepoprawna wartosc opcji.");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Wystapil inny blad.");
		}

		double startTime = System.currentTimeMillis();

		while(true) {
			if(System.currentTimeMillis() - 5000 > startTime) {
				System.exit(0);	
			}
		}
	}
}
