package com.prezi.algo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by root on 2014.10.20..
 */
public class DecryptTheSeries {
    private final List<Integer> numbers;


    public DecryptTheSeries(List numbers) {
        this.numbers = numbers;
    }
    public int decrypt() {
        return sequenceNumber(numbers,0,1,0, false);
    }
    private int sequenceNumber(List<Integer> numbers,int aIndex, int bIndex,int current,boolean prev) {
        if(numbers.size() <= bIndex){
            return current;
        }
        if((numbers.get(aIndex) + numbers.get(bIndex)) == 0) {
            return ((prev)? 1:0) +sequenceNumber(numbers, aIndex+2,bIndex+2, ++current,true);
        } else {
            return sequenceNumber(numbers, aIndex+1,bIndex+1,current,false);
        }
    }
}
