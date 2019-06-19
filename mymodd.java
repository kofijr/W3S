public class mymodd {
  
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }  
 
 public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
 
  public static void main(String[ ] args) {
    mymodd myObj = new mymodd();
    myObj.myPublicMethod(); 
  }
}
