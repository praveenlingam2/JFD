package com.nseit.SpringExercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp {
    @Autowired
    private SortAlg bubbleSort;
    public int binarySearch(int[] number,int numberToSearch)
    {
        int[] sortedNumber=bubbleSort.sort(number);
        return numberToSearch;
    }

}
