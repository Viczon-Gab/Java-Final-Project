// Pet.java
public abstract class Pet implements CareSchedule {
    private String name;
    private int age;
    private String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void showCareTips();

    @Override
    public void feed() {
        System.out.println(name + " has been fed!");
    }

    @Override
    public void groom() {
        System.out.println(name + " has been groomed!");
    }
}
