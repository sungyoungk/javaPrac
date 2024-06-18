package javaPrac.defaultMethod;

public class DefaultImplementedChild implements PreviousInterface {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
