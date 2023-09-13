public class Student {
    public static void main(String[] args){}
    private String name;
    private int totalScore;
    private int numQuizzes;

    public Student(String name)
    {
        this.name = name;
        totalScore = 0;
        numQuizzes = 0;
    }
    public String getName() {
        return name;
    }
    public void addQuiz(int score) {
        totalScore += score;
        numQuizzes++;
    }

    public int getTotalScore() {
        return totalScore;
    }
    public double getAverageScore() {
        double average = (double)
        totalScore/numQuizzes;
        return average;
}
}