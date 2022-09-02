package weeek1;

public class Mammal {
    private String name;
    private String age;
    private String gender;
    private String color;

    public Mammal(String name, String age, String gender, String color){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;

    }

    public String getName(){
        return name;

    }
    public String getAge(){
        return age;
        
    }
    public String getGender(){
        return gender;
        
    }
    public String getColor(){
        return color;
        
    }
    public void setname(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    public void display() {
        System.out.println("the name is " + name);
        System.out.println("the age is " + age);
        System.out.println("the gender is " + gender);
        System.out.println("the color is " + color);
        
    }
    }

