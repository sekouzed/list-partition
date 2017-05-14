
Projet maven avec junit4, realisé avec intelliJ IDEA

----Exemple de use case-----------------------
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    System.out.print("list : "); System.out.println(list);

    Collection partition2 = ListPartition.partition(list,2);
    System.out.print("partition en 2 : ");System.out.println(partition2);
    //partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]