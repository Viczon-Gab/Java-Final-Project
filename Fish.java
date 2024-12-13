// Fish.java
public class Fish extends Pet {
    private int tankSize;

    public Fish(String name, int age, int tankSize) {
        super(name, age, "Fish\n");
        this.tankSize = tankSize;
    }

    public int getTankSize() {
        return tankSize;
    }

    @Override
    public void showCareTips() {
        System.out.println("\nCare tips for fish:\n"); 
        System.out.println("Maintain clean water and proper tank temperature.");
        System.out.println("Maintain a suitable number of fish for your tank size"); 
        System.out.println("Use a good-quality filter to remove waste and debris"); 
        System.out.println("Provide proper lighting to simulate day and night cycles"); 
        System.out.println("Choose compatible fish species to avoid aggression or stress");
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}
