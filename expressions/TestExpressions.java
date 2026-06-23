package expressions;

public class TestExpressions {

    public static void main(String[] args) {
        System.out.println("Java is everywhere");

        int score = 10;
        int bonus = 5;
        int totalscore = score + bonus;
            System.out.println("The total score is" + totalscore);
        int age = 20;
        boolean isAdult = age >= 18;
        System.out.println("The age is >= 18 " + isAdult);

        boolean hasPermission = true;
        boolean isActive = false;
        boolean canAccesss = hasPermission && isActive;
        System.out.println("the can access is" + canAccesss);

        String firstName ="kaitun";
        String greeting = "hello, " + firstName;
        System.out.println(greeting);

    }
}
