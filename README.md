I. A brief project overview
The Pet Care Tracker is more than just a tool—it's a companion for pet owners, designed to make caring for your furry friends simpler and more efficient. With its focus on feeding and grooming schedules, this tracker helps ensure that pets receive the consistent, high-quality care they need. From keeping track of feeding times to scheduling grooming sessions and regular health check-ups, it helps owners stay on top of their pets’ routines and avoid missing anything important.
But what really sets the Pet Care Tracker apart is how it goes beyond just keeping a schedule. It encourages pet owners to take a more responsible, sustainable approach to pet care, aligning with bigger environmental goals like SDG 15: Life on Land. By promoting responsible pet ownership, the tracker helps reduce environmental impact and encourages eco-friendly practices that benefit both pets and the owners
In addition, the Pet Care Tracker offers helpful pet care tips, providing advice to ensure your pet's well-being in every aspect physically, mentally, and emotionally. These tips aren’t just generic recommendations; they’re practical and personalized, designed to fit your pet’s unique needs. 

II. Explanation of how OOP principles were applied
**Encapsulation:** The program uses encapsulation to protect important pet information. Pet details such as Pet Name, and species(breed) are kept private, with methods available to access or modify them. This ensures that pet data is handled securely and consistently.
**Inheritance:** The program has a parent class Pet that holds common attributes like name, age, and species. Three Subclasses, Dog, Cat, and Fish inherit from Pet, each adding specific fields like breed for dogs and cat,  or tankSize for fish, customizing care needs for each species.
**Polymorphism:** Used to provide a flexible care tips for different pet species. The method showCareTips() is overridden in each subclass, ensuring that the correct care tips are displayed based on the pet's species. Additionally, the method updateSchedule() is overloaded to allow modification of both feeding and grooming times, making it adaptable to various situations.
**Abstraction:** The program employs abstraction through an interface CareSchedule, which defines methods like feed() and groom(). These methods provide a standardized way to handle feeding and grooming tasks without specifying the details in the interface, which are later implemented in the classes.

III. Details of the chosen SDG and its integration into the project
The SDG 15: Life on Land, is all about protecting and restoring land ecosystems, preventing land degradation, halting biodiversity loss, and ensuring that ecosystems are managed sustainably. While this goal is often linked to broader environmental efforts, it also connects to responsible pet ownership. Our pets are part of the ecosystems we live in, and how we care for them has a direct impact on the environment around us.
The Pet Care Tracker aligns with SDG 15 by encouraging responsible pet care, which helps support the sustainability of land ecosystems. By ensuring that pets are well-fed, groomed, and healthy, the tracker promotes overall pet well-being, reduces waste, and helps make more sustainable use of resources, ultimately contributing to the health of the environment we all share.

IV. IV.Instruction for Running the Program
Option 1: Add Pet
This option allows you to add a new pet to the tracker. Follow these steps:
1.Enter Pet Name:
Type the name of your pet (e.g., "Buddy") and press Enter.
2.Enter Pet Age:
Type the age of the pet (e.g., 2) and press Enter.
3.Enter Pet Species (Dog/Cat/Fish):
Type the species of the pet (e.g., "Dog", "Cat", or "Fish") and press 	Enter.
4.Species-Specific Input:
    If you select Dog: You will be asked to enter the dog's breed.
    If you select Cat: You will be asked to enter the cat's breed.
    If you select Fish: You will be asked to enter the tank size in gallons.
5.Once you enter the required details, the pet will be added to the tracker, or an error will be shown if a pet with the same name already exists.

Option 2: Update Feeding/Grooming Schedule
This option lets you update your pet's care schedule. Follow these steps:
1.Enter Pet Name:
    Type the name of the pet whose schedule you want to update (e.g., 	"Buddy") and press Enter.
2.Enter Action (feed/groom):
    Type either "feed" to update the feeding schedule or "groom" to 	update the grooming schedule. Press Enter.
3.The program will perform the selected action (either feeding or grooming) for the pet. If the pet name is not found, an error message will be displayed.

Option 3: Display Pets
This option allows you to view a list of all pets in the tracker. For each pet, the following details will be displayed:
    Name
    Age
    Species
1.Provide a Care Tips specific to the pet's species.
2.If no pets are added yet, the program will notify you that no pets are found.

Option 4: Exit
This option will close the program. The message "Exiting Pet Care Tracker. Goodbye!" will appear, and the program will terminate.
