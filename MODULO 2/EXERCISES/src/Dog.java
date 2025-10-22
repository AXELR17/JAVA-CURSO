public class Dog extends Animal {
    private String breed;

    public Dog(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void eat (String food){
        System.out.println(getName() + " come" + food);
    }

    public void bark(){
        makeNoise();
    }

    @Override
    public void makeNoise() {
        System.out.println("Guau Guau");
    }






}