package javaPrac.inheritance;

public class AnnotationSample {

    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        AnnotationDeprecated child = new AnnotationDeprecated();
        child.noMoreUSe();
    }
}
