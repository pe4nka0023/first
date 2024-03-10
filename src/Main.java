public class Main {
    public static void main(String[] args) {

        //task 1
        var dog = 8.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        dog = dog + 4;
        cat += 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog = dog - 3.5;
        cat -= 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        var boxer1 = 72.8;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);

        //task 7
        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);

        //task 8
        var totalWorkingHours = 640;
        var workingHours = 8;
        var employeeCount = totalWorkingHours / workingHours;
        System.out.println(employeeCount);
        System.out.println("Всего работников в компании - " + employeeCount + " человек");


        employeeCount = employeeCount + 94;
        totalWorkingHours = employeeCount + workingHours;
        System.out.println("Если в компании работает " + employeeCount + "человек, то всего"
                + totalWorkingHours + "часов работы может быть поделено между сотрудниками");

    }
}