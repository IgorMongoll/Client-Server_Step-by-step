import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	// private static ServerSocket server;

	public static void main(String[] args) throws IOException, InterruptedException {

		
		
		
		
		// çàïóñòèì ïóë íèòåé â êîòîðûõ êîëëè÷åñòâî âîçìîæíûõ íèòåé îãðàíè÷åíî -
		// 10-þ.
		
		//new changes
		
		
		
		ExecutorService exec = Executors.newFixedThreadPool(10);
		int j = 0;

		
		
		
		
		// ñòàðòóåì öèêë â êîòîðîì ñ ïàóçîé â 10 ìèëèñåêóíä ñòàðòóåì Runnable
		// êëèåíòîâ,
		// êîòîðûå ïèøóò êàêîå-òî êîëè÷åñòâî ñîîáùåíèé
		while (j < 10) {
			j++;
			exec.execute(new TestRunnableClientTester());
			Thread.sleep(10);
		}
		
		// çàêðûâàåì ôàáðèêó
		exec.shutdown();
	}
}
