public class constructor {
  int x;

  public constructor(int y) {
    x = y;
  }

  public static void main(String[] args) {
   constructor myObj = new constructor(5);
    System.out.println(myObj.x);
  }
}

