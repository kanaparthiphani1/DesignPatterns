package Strategy;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Questions q = new Questions(new BubbleSort(),new int[]{3,1,4,8,5});
        q.sortQuestions();
    }
}
