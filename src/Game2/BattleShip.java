    package Game2;

    import java.io.IOException;
    import java.util.Scanner;

    public class BattleShip {
        static String player1;
        static String player2;
        static int[][] battlefield1 = new int[10][10];
        static int[][] battlefield2 = new int[10][10];
        static int[][] monitor1 = new int[10][10];
        static int[][] monitor2 = new int[10][10];
        static Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            //enterNames();
            //drawField();
            placeShips(player1, battlefield1);
            placeShips(player2, battlefield2);
            while (true) {
                makeTurn(player1, monitor1, battlefield2);
                if (isCondition()) {
                    break;
                }
                makeTurn(player2, monitor2, battlefield1);
                if (isCondition()) {
                    break;
                }
            }
        }

        public static void enterNames() {
            System.out.println("Enter name for first player");
            player1 = scanner.nextLine();
            System.out.println("Enter name for second player");
            player2 = scanner.nextLine();
        }

        public static void placeShips(String playerName, int[][] battleField) {
            int deck = 4;
            while (deck >= 1) {
                System.out.println(playerName + " put your" + deck + "-deck ship");
                System.out.println("");
                drawField(battleField);
                System.out.println("Please, enter Ox");
                int x = scanner.nextInt();
                System.out.println("Please, enter Oy");
                int y = scanner.nextInt();

                battleField[x][y] = 1;
                System.out.println("Choose direction to your ship");
                System.out.println("1. Horizontal");
                System.out.println("2. Vertical");
                int direction = scanner.nextInt();
                clearScreen();

                for (int i = 0; i < deck; i++) {
                    if (direction == 1) {
                        battleField[x + i][y] = 1;
                    } else {
                        battleField[x][y + i] = 1;
                    }
                }


                deck--;

            }
        }

        public static void drawField(int[][] battlefield) {
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < battlefield.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < battlefield[i].length; j++) {
                    if (battlefield[j][i] == 0) {
                        System.out.print("~ ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println("");
            }
        }

        public static void makeTurn(String playerName, int monitor[][], int battleField[][]) {
            while (true) {
                System.out.println("  0 1 2 3 4 5 6 7 8 9");
                for (int i = 0; i < monitor.length; i++) {
                    System.out.print(i + " ");
                    for (int j = 0; j < monitor[i].length; j++) {
                        if (monitor[j][i] == 0) {
                            System.out.print("~ ");
                        } else if (monitor[j][i] == 1) {
                            System.out.print(". ");
                        } else {
                            System.out.print("X ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("Please, enter Ox");
                int x = scanner.nextInt();
                System.out.println("Please, enter Oy");
                int y = scanner.nextInt();
                clearScreen();

                if (battleField[x][y] == 1) {
                    System.out.println("Hit! Make your turn again");
                    monitor[x][y] = 2;
                } else {
                    System.out.println("Miss. Opponent move");
                    monitor[x][y] = 1;
                    break;
                }

            }
        }

        public static boolean isCondition() {

            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < monitor1.length; i++) {
                for (int j = 0; j < monitor1[i].length; j++) {
                    if (monitor1[j][i] == 2) {
                        count1++;
                    }
                }
            }
            for (int i = 0; i < monitor2.length; i++) {
                for (int j = 0; j < monitor2[i].length; j++) {
                    if (monitor2[j][i] == 2) {
                        count2++;
                    }
                }
            }
            if (count1 >= 10) {
                System.out.println("My congratulations " + player1 + "You win! " + player2);
                return true;
            }
            if (count2 >= 10) {
                System.out.println("My congratulations " + player2 + "You win! " + player1);
                return true;
            }
            return false;
        }

        public static boolean clearScreen() {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return false;
        }
    }







