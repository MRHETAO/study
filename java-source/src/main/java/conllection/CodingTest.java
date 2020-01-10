package conllection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2020/1/10.
 */
public class CodingTest implements FibonacciPalindrome {
    @Override
    public Pair findFibonacciPalindrome(List<Integer> sequence) {
        return new Pair() {
            @Override
            public Integer getFirst() {
                for (int i = 0;i<sequence.size();i++){
                    if (i+2<sequence.size() && sequence.get(i) == sequence.get(i+2)){
                        return sequence.get(i);
                    }
                    if (i+2<sequence.size() && sequence.get(i)+sequence.get(i+1) == sequence.get(i+2)){
                        return sequence.get(i);
                    }
                    if (i+2<sequence.size() && sequence.get(i) == sequence.get(i+1) + sequence.get(i+2)){
                        return sequence.get(i);
                    }
                }
                return null;
            }

            @Override
            public Integer getSecond() {
                for (int i = 0;i<sequence.size();i++){
                    if (i-1>=0 && i+1< sequence.size()){
                        if (sequence.get(i-1) == sequence.get(i+1)){
                            return sequence.get(i);
                        }
                        if ( sequence.get(i-1)+sequence.get(i) == sequence.get(i+1)){
                            return sequence.get(i);
                        }
                        if ( sequence.get(i-1) == sequence.get(i) + sequence.get(i+1)){
                            return sequence.get(i);
                        }
                    }
                }
                return null;
            }
        };
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        CodingTest codingTest = new CodingTest();
        System.out.println(codingTest.findFibonacciPalindrome(list).getFirst()+"    "
        + codingTest.findFibonacciPalindrome(list).getSecond());
    }
}
