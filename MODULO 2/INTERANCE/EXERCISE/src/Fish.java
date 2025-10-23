public class Fish extends Animal {
    private String color;
    private Boolean formSea;
    public Fish(String name, Integer age, String genre, String color, Boolean formSea) {
        super(name, age, genre);
        this.color = color;
        this.formSea = formSea;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFormSea() {
        return formSea;
    }
    public  boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("hembra");
    }


    public void swing(){
               System.out.printf("%s esta nadando%n", getName());

    }
    @Override
    public void hunt() {
        System.out.printf("%s esta nadando, se cruza con el objetivo, abre la boca y se lo come %n", getName());
    }

    @Override
    public void makeNoise() {
       System.out.println("%s es silencioso%n" + getName());
    }

}
