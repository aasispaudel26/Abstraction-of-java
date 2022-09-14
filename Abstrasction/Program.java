package Abstrasction;



public class Program{
    public static void main(String[] args) {
      
        Eagle eagle = new Eagle();
        print(eagle);
        display(eagle);

        Pengiun pengiun = new Pengiun();
        display(pengiun);

    
     }
     public static void display(Bird bird){
        bird.eat();
        bird.run();           
    }
    public static void print(FlightFulBird flight){
        flight.fly();          
    }
    
}

