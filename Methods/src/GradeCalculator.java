public class GradeCalculator {
    static char calculateGrade(int score){
        if(score >= 90 && score <= 100){
            return 'A';
        }else if(score >= 80 && score <= 89){
            return 'B';
        }else if(score >= 70 && score <= 79){
            return 'C';
        }else if(score >= 60 && score <= 69){
            return 'D';
        }else{
            return 'F';
        }
    }
    static void displayStudentGrade(String name,char grade){
        System.out.println(name+" got "+grade+" grade");
    }
    public static void main(String[] args) {
        char grade = calculateGrade(99);
        displayStudentGrade("sandeep",grade);

    }
}
