package entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public double lackForApproval() {
        return 60.00 - finalGrade();
    }

    public String approval() {
        if (finalGrade() >= 60.00){
            return "PASS";
        } else {
            return String.format("FAILED\n" + "MISSING %.2f POINTS\n ", lackForApproval());
        }
    }   
}