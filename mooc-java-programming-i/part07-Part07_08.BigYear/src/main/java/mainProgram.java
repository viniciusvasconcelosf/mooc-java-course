import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                database.addBird(name, latinName);

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if (!database.observation(name)) {
                    System.out.println("Not a bird!");
                }

            } else if (command.equals("All")) {
                database.printAll();

            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                database.printOne(name);
            }
        }
    }
}