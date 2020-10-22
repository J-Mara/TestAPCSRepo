public class Demo {
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = n; i <= j; j--){
         System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    String result = "{";
    if(arr.length < 1){
      return "{}";
    }
    for(int i = 0; i < arr.length-1; i++){
      result += arr[i] + ", ";
    }
    result += arr[arr.length-1] + "}";
    return result;
  }

  public static String arrayDeepToString(int[][] arr){
    String[] arrays;
    String result = "{";
    arrays = new String[arr.length];
    if(arr.length < 1){
      return "{}";
    }
    for(int i = 0; i < arr.length; i++){
      arrays[i] = arrToString(arr[i]);
    }
    for(int i = 0; i < arrays.length-1; i++){
      result += arrays[i] + ", ";
    }
    result += arrays[arrays.length-1] + "}";
    return result;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] result;
    result = new int[rows][cols];
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        result[i][j] = (int)(Math.random() * (maxValue +1));
      }
    }
    return result;
  }

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[][] result;
  result = new int[rows][];
  for(int i = 0; i < rows; i++){
    result[i] = new int[(int)(Math.random() * (cols +1))];
    for(int j = 0; j < result[i].length; j++){
      result[i][j] = (int)(Math.random() * (maxValue +1));
    }
  }
  return result;
}

public static void main(String[] args) {
   int a = 5;
   if(args.length != 0){
     a = Integer.parseInt(args[0]);
   }
   printLoop(a);
  }
}
