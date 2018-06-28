import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {
		// TODO code application logic here

		Scanner input = new Scanner(System.in);
		String option = "";
		String[] keywords= new String[30]; // Defined Array size
		String q = "?";
		String choice = "";
		int count = 0;
		int i = 0;
		int keywordValue = 0;
		int t = 0;
		int o = 0;
		
		System.out.println("Welcome User");
		System.out.println("How many keywords would you like to enter?");
		keywordValue = Integer.parseInt(input.nextLine());

		while (keywordValue >= 2 && count < keywordValue) {
			while (i < keywordValue) {
				System.out.println("Enter keyword:");
				keywords[i] = input.nextLine();
				i++;
			}
			count++;
		}

		i = 0;
		while (keywords[i].contains(option) || choice.contains("Y") || choice.contains("y")) {
			t = 0;
			System.out.println("You can ask me anything from these keywords:");
			System.out.println("===============");
			while (t < keywordValue) {
				System.out.println((t+1)+") "+keywords[t]);
				t++;
			}
			System.out.println("===============");

			System.out.println("So what would you like to talk about?");
			option = input.nextLine();

			o = 0;
			while (o < keywordValue) {
				if (option.contains(q)) {
					System.out.println("You cannot ask questions.");
				} else if (option.contains(keywords[o])) {
					System.out.println("Tell me about " + keywords[o]);
					option = input.nextLine();
				}
				o++;
			}

			System.out.println("Would you like to continue?(Y/N)");
			choice = input.nextLine();
			i++;
			count++;
		}
			System.out.println("Thank You");
			input.close();
	}
}