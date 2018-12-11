import java.util.*;
public class Sorts{


  public static void selectionSort(int[] ary) {
  		int min = 0;
      int holder = 0;
  		for (int start = 0; start < ary.length; start++) {
  			min = start;

  			for (int i = start; i < ary.length; i++) {
  				if (ary[i] < ary[min]){
          min = i;
          holder = ary[min];
          ary[min] = ary[start];
          ary[start] = holder;
        }

  			}

  		}


   }


 public static void bubbleSort(int[] args){
  if(args.length!= 0){
    int b = args.length;
    for(int i = 0; i < args.length - 1; i++){
      for(int j = 0; j < b - 1; j = j ++){
        if (args[j] > args[j + 1]){
          int holder = args[j];
          args[j] = args[j + 1];
          args[j + 1] = holder;
        }
      } b -= 1;
    }
  }
}

public static void insertionSort(int[] ary){
  for(int i = 1; i < ary.length; i++){
    int orig = ary[i];
    int cur = i;
    while(cur > 0 && ary[cur-1] > orig){
      ary[cur + 1] = ary[cur]; //shift
      cur --;
    }
    ary[cur] = orig;
  }
}

}
