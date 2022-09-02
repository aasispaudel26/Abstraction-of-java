package weeek1;

public class Bat extends Mammal {
    public String wings;
    public Bat(String name, String age, String gender, String color, String wings){
        super( name, age, gender, color);
        this.wings = wings;
    }
    public String getWings(){
        return wings;
        
    }
    public void setWings(String wings){
        this.wings= wings;
    }

    public void display() {
    
        System.out.println("the name is" + super.getName());
        System.out.println("the wings is " + wings);
       
        
    }

}
