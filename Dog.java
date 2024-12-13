// Dog.java
public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog\n");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void showCareTips() {
        System.out.println("\nCare tips for dogs:\n"); 
        System.out.println("Provide regular walks, grooming, and a balanced diet");
        System.out.println("Avoid feeding them human foods like chocolate, grapes, or onions, which can be toxic"); 
        System.out.println("Brush your dog’s teeth regularly to prevent plaque buildup and gum disease"); 
        System.out.println("Always provide fresh, clean water for your dog to keep them hydrated"); 
        System.out.println("\n------------------------------------------------------------------------------------------------");
    }
}
