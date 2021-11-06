package First_Application;

import components.queue.Queue;

/**
 * @author chase
 *
 */
public class JapaneseAlphabet implements IAlphabet {

    private String title = "Japanese";

    /**
     *
     */
    @Override
    public Queue<Character> getAlphabet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

}
