//cc_bad_code_1 shows a code where a single function is too long

public class cc_bad_code_1 {
    public static void main(String args[]) {
        printAgeGroup("Marcus", 21);
    }
    public static void printAgeGroup(String person, int age){
        String article="";
        String group="";
        if (age <= 2){
            article="a";
            group="baby";
        } else if (age >= 10 && age <= 17){
            article="a";
            group="teenager";
        } else if (age >=18 && age <= 24){
            article="a";
            group="young adult";
        } else if (age >= 25 && age <= 60){
            article="an";
            group="adult";
        } else if (age > 60){
            article="an";
            group="elderly";
        }
        String guessAgeGroup = String.format("%s is %s %s", person, article, group);
        System.out.println(guessAgeGroup);
    }
}