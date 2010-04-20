public class Add {
  public static void main(String[] args) {
    long before = System.currentTimeMillis();
    int i = 0;
    int j = 1;
    while(i < 10000000)
      i = i + j;
    long time = System.currentTimeMillis() - before;
    System.out.println("Java time: " + time + "ms");
  }
}