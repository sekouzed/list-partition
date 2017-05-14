package io.github.sekouzed.listpartition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sekouzed on 14/05/2017.
 */
public class ListPartition {

    public static Collection partition(List<Integer> list, int taille) {

        Collection res = new ArrayList<List<Integer>>();

        int i = 0;
        int size = list.size();

        while(i<size){
            int pas = i+taille;
            if( pas < size ){
                res.add(list.subList(i,pas));
            }else {
                res.add(list.subList(i,size));
            }
            i = pas;
        }
        return res;
    }
}
