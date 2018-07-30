package com.company;

class Pole {

    public Pole() {


    }
    static char[][] Map = new char [3][3];


    // Игровое поле
    static void X_O(){


        for (int i = 0; i < Map.length ; i++) {

            for (int j = 0; j < Map.length ; j++) {

                Map[i][j] = '-';

            }

        }



    }
    //Первичная отрисовка в начале
    static void print1(){
        int a;

        System.out.println("   1 2 3");

        for (int i = 0; i < Map.length; i++) {
            a = i + 1;
            System.out.print(a + "  ");

            for (int j = 0; j < Map.length; j++) {


                System.out.print(Map[i][j] + " ");
            }

            System.out.println();
        }

    }
    //Отрисовка игры

    static void print(int i1, int j1, int a1){
        int a;

        System.out.println("   1 2 3");

        for (int i = 0; i < Map.length; i++) {
            a = i + 1;
            System.out.print(a + "  ");

            for (int j = 0; j < Map.length; j++) {
                //Ставит элемент в зависимости от того кто ходит
                if (a1 == 0){

                    Map[i1][j1] = 'X';





                }
                else if(a1 == 1) {

                    Map[i1][j1] = 'O';


                }

                else {
                    Map[i1][j1] = '-';
                }

                System.out.print(Map[i][j] + " ");
            }

            System.out.println();
        }


        // При достижении пробеды не могу понять как прервать игру
        for (int i = 0; i < 1 ; i++) {


            //Проверка на победа игрока Х
            if (Map[0][0] == 'X' && Map[0][1] == 'X' && Map[0][2] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }

            if (Map[1][0] == 'X' && Map[1][1] == 'X' && Map[1][2] == 'X') {
                System.out.println("Победил игрок  Х  ");

                int i2 = 0;
                System.exit(i2);
                break;
            }

            if (Map[2][0] == 'X' && Map[2][1] == 'X' && Map[2][2] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][0] == 'X' && Map[1][0] == 'X' && Map[2][0] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][1] == 'X' && Map[1][1] == 'X' && Map[2][1] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][2] == 'X' && Map[1][2] == 'X' && Map[2][2] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][0] == 'X' && Map[1][1] == 'X' && Map[2][2] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][2] == 'X' && Map[1][1] == 'X' && Map[2][0] == 'X') {
                System.out.println("Победил игрок  Х  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }


            //Проверка на победа игрока О
            if (Map[0][0] == 'O' && Map[0][1] == 'O' && Map[0][2] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }

            if (Map[1][0] == 'O' && Map[1][1] == 'O' && Map[1][2] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }

            if (Map[2][0] == 'O' && Map[2][1] == 'O' && Map[2][2] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][0] == 'O' && Map[1][0] == 'O' && Map[2][0] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][1] == 'O' && Map[1][1] == 'O' && Map[2][0] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][2] == 'O' && Map[1][2] == 'O' && Map[2][2] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][0] == 'O' && Map[1][1] == 'O' && Map[2][2] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
            if (Map[0][2] == 'O' && Map[1][1] == 'O' && Map[2][0] == 'O') {
                System.out.println("Победил игрок  O  ");
                int i2 = 0;
                System.exit(i2);
                break;
            }
                int v = 0;
            for (i = 0; i < Map.length; i++){
                for (int j = 0; j < Map.length ; j++) {

                if(Map[i][j] != '-'){
                  v = v+1;
                  if (v == 9) {
                      System.out.println("Ничья");
                      int i2 = 0;
                      System.exit(i2);
                      break;
                  }
                }
                }
            }
        }
    }
}
