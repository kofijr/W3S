class Vehicle {
  protected String brand = "Ford";        
  public void honk() {                     
    System.out.println("Tuut, tuut!");
  }
}

class Carr extends Vehicle {
  private String modelName = "Mustang";    
  public static void main(String[] args) {

  
    Carr myCarr = new Carr();
      myCarr.honk();
      System.out.println(myCarr.brand + " " + myCarr.modelName); 
  }
}
