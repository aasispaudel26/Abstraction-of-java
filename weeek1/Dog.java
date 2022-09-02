package weeek1;

public class Dog extends Mammal {
    private String breed;

    public Dog(String name, String age, String gender, String color, String breed){
        super( name, age, gender, color);
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
        
    }
    public void setBreed(String breed){
        this.breed= breed;
    }

    public void display() {
        super.display();
        System.out.println("the breeed is " + breed);
        
    }
}
