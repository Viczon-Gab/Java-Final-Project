public class Cat extends Pet {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age, "Cat\n");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void showCareTips() {
        System.out.println("\nCare tips for cats:\n");
        System.out.println("Keep their litter box clean and provide scratching posts");
        System.out.println("Brush your cat’s fur regularly to reduce shedding and prevent matting");
        System.out.println("Keep the litter box clean by scooping daily and changing the litter regularly");
        System.out.println("Offer scratching posts or pads to keep your cat’s claws healthy and protect your furniture");
        System.out.println("\n------------------------------------------------------------------------------------------------");
    }
}
