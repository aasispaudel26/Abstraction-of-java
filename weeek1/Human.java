package weeek1;

public class Human extends Mammal {
    private String address;

    public Human(String name, String age, String gender, String color, String address){
        super(name, age, gender, color);
        this.address = address;
    }

    public String getAddress(){
        return address;
        
    }
    public void setAddress(String adddress){
        this.address= adddress;
    }
    public void display() {
        super.display();
        System.out.println("the address is " + address);
        
    }

}
