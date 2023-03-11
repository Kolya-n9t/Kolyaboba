package Lesson3;

public interface CR {
    public static void main(String[] args) {

    }

    //інтерфейс Їдок
    public interface Eater{
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    //інтерфейс Ненажера
    public interface Glutton extends Eater {
        boolean READY_TO_GO_HOME = false;

        void overEat();
        @Override
        boolean isReadyToGoHome();
    }

    public static class EatLover implements Glutton{


        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sayThankYou() {

        }

        @Override
        public void overEat() {

        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }

}
