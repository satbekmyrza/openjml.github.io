// openjml --esc $@
public class T_Visibility1 {
    private int value;

    //@ ensures \result == value;
    public int value() {
        return value;
    }
}
