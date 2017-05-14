
Realisé avec : maven junit4 et intelliJ IDEA

----Exemple d'utilisation-----------------------

package io.github.sekouzed.listpartition;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*
        partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
        partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
        partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
*/
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.print("list : "); System.out.println(list);

        Collection partition2 = ListPartition.partition(list,2);
        System.out.print("partition en 2 : ");System.out.println(partition2);

        Collection partition3 = ListPartition.partition(list,3);
        System.out.print("partition en 3 : ");System.out.println(partition3);

        Collection partition1 = ListPartition.partition(list,1);
        System.out.print("partition en 1 : ");System.out.println(partition1);
    }

}
