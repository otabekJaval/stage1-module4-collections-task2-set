package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {

    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer>res=new TreeSet<>();

        for (int i = 0; i < sourceList.size(); i++) {
            int abs = Math.abs(sourceList.get(i));
            abs = abs * abs;
            res.add(abs);
        }

        return res.subSet(lowerBound,true, upperBound,true);

    }
}
