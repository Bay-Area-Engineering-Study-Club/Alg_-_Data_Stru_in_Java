package com.company;

/**
 * Created by macbook on 3/3/18.
 */
public class QuickSort {
    public int[] mergeSort(int[] array) {
        // Write your solution here
        if (array == null){
            return array;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length -1);
        return array;
    }
    private void mergeSort(int[] array, int[] helper, int left, int right){
        if (left >= right){
            return ;
        }
        int mid = left + (right- left)/2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid+1, right);
        merge(array, helper, left, mid, right);
        return;
    }
    private void merge(int[] array, int[] helper, int left, int mid, int right){
        for (int i=0; i<= right ; i++){
            helper[i] = array[i];
        }
        int leftIdx = left;
        int rightIdx = mid+1;
        while (leftIdx  <= mid && rightIdx <= mid){
            if (helper[leftIdx] <= helper[rightIdx]){
                array[left++] = helper[leftIdx++];
            } else {
                array[left++] =  helper[rightIdx++];
            }
        }
        while (leftIdx <= mid){
            array[left++] = helper[leftIdx++];
        }
        return;
    }
}