package javaPrac.inner;

import jdk.jfr.Event;

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

    public void setButtonListenerAnomymous() {
        MagicButton button = new MagicButton();
        button.setListener(
                new EventListener() {
                    @Override
                    public void onClick() {
                        System.out.println("Magic Button Clicked!!!");
                    }
                }
        );
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            public void onClick() {
                System.out.println("Magic Button Clicked");
            }
        };
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
