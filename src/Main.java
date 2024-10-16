import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

ContactManger manager = new ContactManger();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nGestion des contacts");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Lister les contacts");
            System.out.println("3. Rechercher un contact");
            System.out.println("4. Supprimer un contact");
            System.out.println("5. Quitter");
            System.out.print("Choisir une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consommer la nouvelle ligne

            switch (choice) {
                case 1:
                    System.out.print("Nom du contact : ");
                    String name = scanner.nextLine();
                    System.out.print("Numéro de téléphone : ");
                    String phoneNumber = scanner.nextLine();
                    manager.addContact(name, phoneNumber);
                    break;
                case 2:
                    manager.listContacts();
                    break;
                case 3:
                    System.out.print("Nom à rechercher : ");
                    String searchName = scanner.nextLine();
                    manager.searchContact(searchName);
                    break;
                case 4:
                    System.out.print("Nom du contact à supprimer : ");
                    String removeName = scanner.nextLine();
                    manager.removeContact(removeName);
                    break;
                case 5:
                    running = false;
                    System.out.println("Fermeture de l'application.");
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        }

        scanner.close();




    }


}