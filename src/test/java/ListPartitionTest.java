/**
 * Created by sekouzed on 14/05/2017.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import io.github.sekouzed.listpartition.ListPartition;
import java.util.Arrays;
import java.util.List;

public class ListPartitionTest {
    @Test
    public void partitionExpression() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
/*
        partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
        partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
        partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]
*/
        assertEquals(ListPartition.partition(list,2) , Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5)
        ));

        assertEquals( ListPartition.partition(list,3) , Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5)
        ));

        assertEquals( ListPartition.partition(list,1),Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(4),
                Arrays.asList(5)
        ));


    }
}
