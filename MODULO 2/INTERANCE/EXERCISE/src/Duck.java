public class Duck extends Animal implements CanFly, CanRun{
    private String color;

    public Duck(String name, Integer age, String genre, String color) {
        super(name,age, genre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public void fly(){
        System.out.printf("%s esta volando%n", getName());

    }
      public void swing(){
               System.out.printf("%s esta nadando%n", getName());

    }
    public  boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("hembra");
    }

    @Override
    public void hunt() {
        System.out.printf( "%s va nadando, se posa sobre el pez y mete la cabeza para tomarlo %n", getName());
       
    }

    @Override
    public void makeNoise() {
       System.out.printf("%s hace Cuak Cuak  %n" + getName());
    }
    @Override
    public void run (){
        System.out.printf("%s esta corriendo%n", getName());
    }
    
    
}
