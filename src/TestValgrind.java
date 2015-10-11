import java.util.Scanner;


public class TestValgrind {

	/**
	 * @param args
	 * @return a
	 */
	public native int malloc(int size);
	public native void free();
	private static Boolean exit = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestValgrind test = new TestValgrind();
		Scanner in = new Scanner(System.in);
		String command;
		while (!exit) {
			System.out.println("Press A to allocate memory, F to free memory, E to exit ");
			command = in.next();
			if (command.equals("a")) {
				if(test.malloc(1000000)==0)
					System.out.println("Ok");
				else
					System.out.println("Error");
			}
			else if (command.equals("f")){
				test.free();
			}
			else if (command.equals("e")) {
				exit = true;
			}
			else {
				continue;
			}
			
		}
		System.out.println("Exit");
		System.exit(0);
	}
	static{
		System.loadLibrary("Test");
	}

}
