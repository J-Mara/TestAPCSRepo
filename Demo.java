public class Demo {
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = n; i <= j; j--){
         System.out.print(i);
      }
      System.out.println();
    }
  }
public static void main(String[] args) {
   int a = Integer.parseInt(args[0]);
   printLoop(a);
  }
}
