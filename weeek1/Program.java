package weeek1;

public class Program {
    public static void main(String[] args) {
        Mammal cow = new Mammal("cow", "7", "female", "white");
        cow.display();

        Dog jonny = new Dog("jonny", "10", "male", "black", "votey");
        jonny.display();

        Human krishna = new Human("krishna", "24", "male", "black", "somaliya");
        krishna.display();
         
        Bat chamera = new Bat("chamera", "4", "female", "black", "4");
        chamera.display();
    }
    
}
