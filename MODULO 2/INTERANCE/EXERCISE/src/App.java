public class App {
    public static void main(String[] args) throws Exception {
        var eagle = new Eagle("Maria", 2, "hembra", "Arpia");
        var lion = new Lion("Andres", 5, "Macho", "Amarillo");
        var fish = new Fish("Memo", 1, "Macho", "Naranja", true);
        var duck = new Duck("Manuel", 7, "Macho", "negro");

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("El " + eagle.getName() + " tiene " + eagle.getAge() + " años");
        System.out.println("El " + eagle.getName() + " " + (eagle.canPutEggs() ? " si" : " no")+ " puede poner huevos ");

        lion.run();
        lion.hunt();
        lion.happyBirthday();
        System.out.println("El " + lion.getName() + " tiene " + lion.getAge() + " años");
       

        fish.swing();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("El " + fish.getName() + " tiene " + fish.getAge() + " años");
        System.out.println("El " + fish.getName() + " " + (fish.isFormSea() ? "es de mar" : "es de rio"));
    
        duck.swing();
        duck.hunt();
        duck.happyBirthday();
        duck.fly();
        duck.run();
        System.out.println("El " + duck.getName() + " tiene " + duck.getAge() + " años");
        System.out.println("El " + duck.getName() + " " + (duck.canPutEggs() ? " si" : " no")+ " puede poner huevos ");
        
        CanRun animal1 = new Duck("Pato", 1, "Hembra", "Verde");
        animal1.run();
        CanFly animal2 = (CanFly) animal1;
        animal2.fly();
        Animal animal3 = (Animal) animal2;
        animal3.happyBirthday();
        animal3.makeNoise();
    
    
    }
}
