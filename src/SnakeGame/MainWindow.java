    package SnakeGame;

    import javax.swing.*;

class Snake_Game {


    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
        public static class MainWindow extends JFrame {


            public MainWindow() {
                setTitle("Змійка");
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setSize(320, 345);
                setLocation(400, 400);
                add(new GameField());
                setVisible(true);
            }


            }
        }

