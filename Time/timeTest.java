package Time;

public class timeTest {

  public static void main(String[] args) {
    Time t1 = new Time(23, 10, 15);
    Time t2 = new Time(10, 23, 14);

    System.out.println("");
    System.out.println("Time One: " + t1);
    System.out.println("Time Two: " + t2);
    System.out.println("");

    t1.nextSecond();
    t2.previousSecond();

    System.out.println("");
    System.out.println("Time One: " + t1);
    System.out.println("Time Two: " + t2);
    System.out.println("");
  }
}
