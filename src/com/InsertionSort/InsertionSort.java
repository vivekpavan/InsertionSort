package com.InsertionSort;

//YOU ARE SWAPPING AT EACH TRAVERSAL OR STEP;

public class InsertionSort {
    public void InsertionSort(int[] array){
        for(var i = 1;i < array.length;i++) {
            var a = i;
            while (true) {
                if( a == 0 || array[a] >= array[a-1])
                    break;
                if (array[a] < array[a - 1]) {
                    swap(array, a, a - 1);
                    a--;
                }
            }
        }
    }
    private void swap(int[] array,int index1,int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
