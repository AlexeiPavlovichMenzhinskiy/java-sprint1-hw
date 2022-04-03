import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int shagiVden = 0;
        int[][] monthToDate = new int[30][12];
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter(0.75, 0.05);
        StepTracker tracker = new StepTracker();


        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.print("Сколько шагов вы хотите пройти сегодня?");
                tracker.setStepGoal(scanner.nextInt());
                System.out.println("План по шагам на сегодня изменен успешно!");

            } else if (command == 2) {
                shagiVden = recordSteps(scanner, monthToDate);
                converter.convert(shagiVden);
            } else if (command == 3) {
                printStatistics(scanner,monthToDate);


            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Такой команды нет. Пожалуйста, попробуйте еще раз.");
            }

        }


    }


    private static void printMenu() {
        System.out.println("");
        System.out.println("Что вы хотите сделать? ");
        System.out.println("");
        System.out.println("");
        System.out.println("1 - Ввести цель по шагам на день.");
        System.out.println("2 - Ввести пройденное количество шагов за определенный день.");
        System.out.println("3 - Посмотреть статистику за выбранный месяц.");
        System.out.println("0 - Выход.");
    }


    public static void printStatistics(Scanner scanner, int[][] monthToDate) {
        System.out.println("За какой месяц смотрим: 1-ЯНВАРЬ, 2-ФЕВРАЛЬ, 3-МАРТ, 4-АПРЕЛЬ, 5-МАЙ, 6-ИЮНЬ, 7-ИЮЛЬ, 8-АВГУСТ, 9-СЕНТЯБРЬ, 10-ОКТЯБРЬ, 11-НОЯБРЬ, 12-ДЕКАБРЬ?");
        int MaxSteps = 0;
        int sumAllSteps = 0;
        int column = scanner.nextInt();  // переменная для корректного вывода нужного столбца двумерного массива
        for (int i = 0; i <monthToDate.length ; i++) {  //идём по строкам
            for (int j = column-1 ; j < column; j++) { //идём по столбцам
                if (monthToDate[i][j] >MaxSteps){
                    MaxSteps = monthToDate[i][j];
                }
                sumAllSteps = sumAllSteps + monthToDate[i][j];

                System.out.print("день " + (i+1) + " пройдено " + monthToDate[i][j] + " шагов"); //вывод элемента
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Общее количество шагов за месяц: " + sumAllSteps);
        System.out.println("Среднее количество шагов за месяц: " + sumAllSteps/30);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + MaxSteps);
        System.out.println("Пройденная дистанция составила: " + (int)(sumAllSteps*0.75) + " метров");
        System.out.println("Вы сожгли: " + (int)(sumAllSteps*0.05) + " килокилорий");

    }


    public static int recordSteps(Scanner scanner, int[][] twoDimArray) {


        System.out.println("Введите число месяца, за которое вводим шаги (1-30)" );
        int i = scanner.nextInt(); // [i]

        System.out.println("В каком месяце вводим шаги: 1-ЯНВАРЬ, 2-ФЕВРАЛЬ, 3-МАРТ, 4-АПРЕЛЬ, 5-МАЙ, 6-ИЮНЬ, 7-ИЮЛЬ, 8-АВГУСТ, 9-СЕНТЯБРЬ, 10-ОКТЯБРЬ, 11-НОЯБРЬ, 12-ДЕКАБРЬ?");
        int j = scanner.nextInt(); // [j]

        System.out.println("Введите количество шагов");
        int newShagi = scanner.nextInt();

        twoDimArray[i-1][j-1] = twoDimArray[i-1][j-1] + newShagi;
        System.out.println("Значение сохранено! Пройдено " + newShagi + " шагов.");

        return newShagi;
    }

    public static void bestSeries

}


