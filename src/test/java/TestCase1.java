import org.example.Solution;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestCase1 {

    static Stream<Arguments> methodSourceArgs(){
            return Stream.of(
                    arguments(new int[]{3, 8, 9, 7, 6},3,new int[]{9,7,6,3,8}),
                    arguments(new int[]{1,2,3,4},2,new int[]{3,4,1,2}),
                    arguments(new int[]{1,2,3,4},4,new int[]{1,2,3,4}),
                    arguments(new int[]{0,0,0},1,new int[]{0,0,0})
            );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A,int K,int[] expected){
        Solution s=new Solution();
        System.out.println(arrayToString(A) +"  ---  "+arrayToString(expected));
        assertTrue(Arrays.equals(s.solution(A,K),expected));
    }

    public static void endTestCase(int numberOfTestCase){
        System.out.println("---------------------End of Test Case "+numberOfTestCase+"------------");
    }
    private String arrayToString(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        String joinedString = stringBuilder.toString();
        return joinedString;
    }

    @AfterAll
    public static void endT0(){
        endTestCase(1);
    }
}
