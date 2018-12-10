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
      }
			}

			holder = ary[min];
			ary[min] = ary[start];
			ary[start] = holder;
      return;
		}


 }


 public static void bubbleSort(int[] args){
   int holder;
   boolean s = false;
   //s stores if there was a swap, if no swaps were made in the last round we go through
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


}
