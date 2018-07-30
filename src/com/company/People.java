package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.Pole.Map;
import static com.company.Pole.print;

class People {

    static void game_people() {


        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int a = random.nextInt(2);
        int b;
        int c;


        System.out.println("===================================");
        System.out.println();

        do {

            //Чередованием хода
            if (a == 0) {
                System.out.println();
                System.out.println();
                System.out.println("Ход игрока Х ");
                System.out.println();

                System.out.println("Введите координаты: ");

                //Проверка на правильность введённых значений

                do {
                    do {

                        System.out.print("X = ");
                        b = in.nextInt();
                        b = b - 1;

                        System.out.print("Y = ");
                        c = in.nextInt();
                        c = c - 1;
                        System.out.println();
                    }
                    while (b > 2 || c > 2);
                }
                while (Map[b][c] == 'X' || Map[b][c] == 'O');

                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println();

                print(b, c, a);


                //Следующий ход
                a = a + 1;
            } else {
                System.out.println();

                System.out.println();
                System.out.println("Ход игрока O ");
                System.out.println();

                System.out.println("Введите координаты: ");

                //Проверка на правильность введённых значений

                do {
                    do {

                        System.out.print("X = ");
                        b = in.nextInt();
                        b = b - 1;

                        System.out.print("Y = ");
                        c = in.nextInt();
                        c = c - 1;
                        System.out.println();
                    }
                    while (b > 2 || c > 2);
                }
                while (Map[b][c] == 'X' || Map[b][c] == 'O');

                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println();

                print(b, c, a);

                //Следующий ход
                a = a - 1;
            }
        } while (true);
    }
}
