package java_tasks;

public class Example {
    public String question;
    public String answer;
    public String solution;
    public int number;

    public void solve(){
        System.out.println(question+"coding bat");
    }

    public void student(){
        System.out.println(answer+"here is the answer");
    }

    @Override
    public String toString() {
        return "Example{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", solution='" + solution + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        Example example1 = new Example();
        example1.question= "hard";

        System.out.println(example1);
        example1.solve();



    }



}