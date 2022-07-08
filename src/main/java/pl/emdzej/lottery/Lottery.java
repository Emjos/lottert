package pl.emdzej.lottery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottery {

    static List<Integer> getRandomList()
    {
        List <Integer> numberList = new Random().ints(6,1,49)
                .boxed().collect(Collectors.toList());

        return numberList;

    }
    
    static List<Integer> getCommonElement(List<Integer> source, List<Integer> target)
    {
       List <Integer> matchNumbers = new ArrayList<>();
        for (Integer so : source)
        {
            for (Integer tar: target)
            {
                if (so == tar)
                {
                    matchNumbers.add(so);
                }
            }
        }
        
        return matchNumbers;
    }
}
