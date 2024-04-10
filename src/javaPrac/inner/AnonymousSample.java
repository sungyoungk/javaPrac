package javaPrac.inner;

public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    class MagicButtonListener implements EventListener {
        @Override
        public void onClick() {
            System.out.println("magic Buttonn Clicked");
        }
    }

}
