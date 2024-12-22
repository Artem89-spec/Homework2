public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println();

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println();

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println();

        // Задача 4
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        // Задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);

        var weightDifference = weightBoxer2 - weightBoxer1 ;
        System.out.println(weightDifference);
        System.out.println();

        // Задача 7
        weightDifference = weightBoxer2 % weightBoxer1;
        System.out.println(weightDifference);
        System.out.println();

        // Задача 8
        var hoursTotal = 640;
        var hoursEmployee = 8;
        var employeeTotal = hoursTotal / hoursEmployee;
        System.out.println("Всего работников в компании - " + employeeTotal + " человек.");

        employeeTotal = employeeTotal + 94;
        hoursTotal = employeeTotal * hoursEmployee;
        System.out.println("Если в компании работает " + employeeTotal + " человека, то всего " + hoursTotal + " часа работы может быть поделено между сотрудниками.");
    }
}