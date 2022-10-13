package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {



    public HashSet<Integer> createHashSet(List<Integer> sourceList) {


        HashSet<Integer> res = new HashSet<>();

        for (int i = 1; i <= sourceList.size(); i++) {

            int c = 0;
            if (sourceList.get(i - 1) % 2 == 0) {

                while (true) {

                    int val = getVal(sourceList.get(i - 1), c);

                    res.add(val);

                    if (val % 2 != 0)
                        break;

                    c++;
                }
            } else {

                while (true) {

                    int val = getOddVal(sourceList.get(i - 1), c);

                    res.add(val);

                    if (val % 2 == 0)
                        break;

                    c++;
                }
            }
        }
        return res;
    }

    private  int getOddVal(Integer integer, int c) {

        if (c == 0) return integer;


        for (int i = 0; i < c; i++) {

            integer = integer * 2;
        }

        return integer;
    }

    private  int getVal(Integer integer, int i) {

        if (i == 0) return integer;


        for (int i1 = 0; i1 < i; i1++) {
            integer = (integer / 2);
        }

        return integer;

    }
}
