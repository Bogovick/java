package com.company;

        import java.util.Scanner;

        import static com.company.Computer.game_computer;
        import static com.company.People.game_people;
        import static com.company.Pole.X_O;
        import static com.company.Pole.print1;

class Main {


    public static void main(String[] args) {
        // Написать игру крестики-нолики. В игре должны быть 2 режима : с компьютером, и с человеком.
        //
        //Также, должен быть счетчик поражений и побед, отдельно для игры с компьютером, отдельно для игры с человеком.
        //
        //Краткое пояснение для начала выполнения : для начала нужно создать игровое поле - массив 3х3
        //(например, символов char).
        //
        //Затем для игроков организовать поочёрёдное считывание ходов и запись их в массив.
        // Пусть для одного игрока - это будет X, а для второго O.
        // Затем, после хода, нужно реализовать проверку 3 одинаковых значений в подряд
        // (три Х или О подряд по горизонтали, вертикали и диагонали). Если такая "тройка" найдена,
        // то выигрывает текущий игрок.

        Scanner in = new Scanner(System.in);

        int g;
        System.out.println("Вас приветствует игра (крестики нолики)");
        System.out.println("Сделайте выбор");
        System.out.println("1 - Компьютер, 2 - Человек");
        g = in.nextInt();



        X_O();
        print1();

        switch (g){
            case 1: {
                game_computer();
            }
            case 2: {
                game_people();
            }
        }

    }








}