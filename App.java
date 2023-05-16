public class App {
    public static void main(String[] args) throws Exception {
   
        Animal animal = new Animal("Animal", 10.5);
        Peixe peixe = new Peixe("Peixe", 0.5, "Aquario");
        Cachorro cachorro = new Cachorro("Cachorro", 50.0, "Rottweiler");

        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(cachorro);

        
    }
}
