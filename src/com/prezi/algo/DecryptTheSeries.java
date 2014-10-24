package com.prezi.algo;

import java.util.List;

/**
 * Created by root on 2014.10.20..
 */
public class DecryptTheSeries {
    public static final int START_INDEX = 0;
    public static final int INITIAL_VALUE = 0;

    private final List<Integer> numbers;

    public DecryptTheSeries(List numbers) {
        this.numbers = numbers;
    }
    public int decrypt() {
        if(this.numbers == null || this.numbers.size()==0) {
            return 0;
        } else {
            return sequenceNumber(START_INDEX, START_INDEX+1, INITIAL_VALUE, false);
        }

    }
    private int sequenceNumber(int aIndex, int bIndex,int current,boolean prevMatched) {
        if(numbers.size() <= bIndex){
            return current;
        }
        if((numbers.get(aIndex) + numbers.get(bIndex)) == 0) {
            return ((prevMatched)? 1:0) + sequenceNumber(aIndex+2, bIndex+2, ++current,true);
        } else {
            return sequenceNumber(aIndex+1,bIndex+1,current,false);
        }
    }
}
