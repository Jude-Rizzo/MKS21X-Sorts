import java.util.*;
public class Sorts{


  public static void selectionSort(int [] data) {
  for (int i = 0; i < data.length - 1; i++) {
     int min = i;

    for (int j = i + 1; j < data.length; j++) {
      if (data[j] == (Math.min(data[j], data[min]))) {
        min = j;
      }

      }
    int m = data[min];
    data [min] = data[i];
    data[i] = m;
  }
}


public static void bubbleSort(int[] ary) {
   int holder;
   boolean s;
   for (int j = ary.length-1; j >= 0; j--) {
     s = false;
     for (int i = 0; i < j; i++) {
       if (ary[i+1] < ary[i]) {
         holder = ary[i];
         ary[i] = ary[i+1];
         ary[i+1] = holder;
         s = true;
       }
     }
     if (!s) return;
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
