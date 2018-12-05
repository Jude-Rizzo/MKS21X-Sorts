import java.util.*;


public class Sorts{



public static void selectionsort( int[] ary) {

   for( int i = 0; i < ary.length; i++) {
     int min = 0;
     int index = 0;
     int holder = 0;
     for( int j = i; j < ary.length; j++) {
       if( ary[j] <= min) {
         min = ary[j];
         index = j;
       }
     }
     holder = ary[i];
     ary[i] = min;
     ary[index] = holder;
   }
   System.out.println(Arrays.toString(ary));
 }

public static void main(String[] args){
  int[] test = new int[6];

  for(int i = 0; i < 6; i++){
    test[i] = (int) (Math.random() * 1000);
  }
  System.out.println(Arrays.toString(test));
  Sorts.selectionsort(test);


}
}
