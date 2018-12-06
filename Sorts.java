import java.util.*;


public class Sorts{


  public static void selectionsort(int[] ary) {
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
