package hello.core.extendsEncapsulationSample;

public class Student extends People {

    private int korean_score;
    private int math_score;
    private int english_score;

    public Student(int kor_score, int mat_score, int eng_score){
        this.korean_score = kor_score;
        this.math_score = mat_score;
        this.english_score = eng_score;
    }

    public void printScore() {
        System.out.println("국어성적 : " + korean_score);
        System.out.println("수학성적 : " + math_score);
        System.out.println("영어성적 : " + english_score);
    }
}
