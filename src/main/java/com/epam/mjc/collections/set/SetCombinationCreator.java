package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public  Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {


        thirdSet.removeIf(firstSet::contains);
        thirdSet.removeIf(secondSet::contains);

        firstSet.removeIf(obj -> !secondSet.contains(obj));
        firstSet.removeIf(thirdSet::contains);

        HashSet<String> res = new HashSet<>(firstSet);

        res.addAll(thirdSet);


        return res;
    }
}
