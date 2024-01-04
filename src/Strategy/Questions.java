package Strategy;

import java.util.Arrays;

public class Questions {
    private SorterStrategy strategy;
    private int[] quesNos;
    Questions(SorterStrategy strat, int[] quesNos){
        this.strategy = strat;
        this.quesNos = quesNos;
    }

    public void sortQuestions(){
        strategy.sort(quesNos);
        System.out.println(Arrays.toString(quesNos));
    }
}
