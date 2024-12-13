import java.util.ArrayList;
import java.util.Scanner;

public class PetCareTracker {
    private static ArrayList<Pet> petList = new ArrayList<>();

    public static void addPet(Pet pet) {
        for (Pet p : petList) {
            if (p.getName().equalsIgnoreCase(pet.getName())) {
                System.out.println("Error: A pet with this name already exists!");
                return;
            }
        }
        petList.add(pet);
        System.out.println("Pet added successfully!");
    }

    public static void updateSchedule(String petName, String action) {
        for (Pet pet : petList) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                if (action.equalsIgnoreCase("feed")) {
                    pet.feed();
                } else if (action.equalsIgnoreCase("groom")) {
                    pet.groom();
                } else {
                    System.out.println("Invalid action! Use 'feed' or 'groom'.");
                }
                return;
            }
        }
        System.out.println("Pet not found!");
    }

    public static void displayPets() {
        if (petList.isEmpty()) {
            System.out.println("No pets found!");
            return;
        }
        for (Pet pet : petList) {
            System.out.println("Name: " + pet.getName() + ", Age: " + pet.getAge() + ", Species: " + pet.getSpecies());
            pet.showCareTips();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPet Care Tracker Menu:");
            System.out.println("1. Add Pet");
            System.out.println("2. Update Feeding/Grooming Schedule");
            System.out.println("3. Display Pets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter pet name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter pet age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter pet species (Dog/Cat/Fish): ");
                    String species = scanner.nextLine();

                    if (species.equalsIgnoreCase("Dog")) {
                        System.out.print("Enter dog breed: ");
                        String breed = scanner.nextLine();
                        addPet(new Dog(name, age, breed));
                    } else if (species.equalsIgnoreCase("Cat")) {
                        System.out.print("Enter cat breed: ");
                        String breed = scanner.nextLine();
                        addPet(new Cat(name, age, breed));
                    } else if (species.equalsIgnoreCase("Fish")) {
                        System.out.print("Enter tank size (in gallons): ");
                        int tankSize = scanner.nextInt();
                        addPet(new Fish(name, age, tankSize));
                    } else {
                        System.out.println("Invalid species!");
                    }
                    break;

                case 2:
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    System.out.print("Enter action (feed/groom): ");
                    String action = scanner.nextLine();
                    updateSchedule(petName, action);
                    break;

                case 3:
                    displayPets();
                    break;

                case 4:
                    System.out.println("Exiting Pet Care Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

