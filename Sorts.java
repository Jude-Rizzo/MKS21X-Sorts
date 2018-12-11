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
   int holder;
   boolean s = false;
   if(args.length != 1 && args.length != 0){
   for(int i = args.length - 2; i >= 0;  i--){
     s = false;
     for(int j = 0; j < i; j++){
     if(args[i] < args[i + 1]){
       holder = args[i];
       args[i] = args[i + 1];
       args[i + 1] = holder;
       s = true;
     }
   }
 } if (!s)return;
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
