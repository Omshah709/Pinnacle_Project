import java.util.*;

public class QuizGame {
    static class Question {
        String question;
        String[] options;
        int correctAnswer;

        public Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = getQuestions();
        int score = 0;

        System.out.println("\n===== Welcome to the Java Quiz Game =====\n");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.question);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctAnswer - 1]);
            }
        }

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Name: " + name);
        System.out.println("Your Score: " + score + "/" + questions.size());

        if (score > 20) System.out.println("🏆 Excellent Performance!");
        else if (score > 15) System.out.println("🎯 Good Job!");
        else System.out.println("📚 Keep Practicing!");
    }

    public static List<Question> getQuestions() {
        List<Question> qList = new ArrayList<>();
        qList.add(new Question("Which language is used for Android development?",
                new String[]{"Python", "Java", "C++", "HTML"}, 2));
        qList.add(new Question("What does OOP stand for?",
                new String[]{"Object Output Programming", "Only One Protocol", "Object-Oriented Programming", "Open Order Programming"}, 3));
        qList.add(new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"extends", "implements", "inherits", "super"}, 1));
        qList.add(new Question("Which data structure uses LIFO?",
                new String[]{"Queue", "Array", "Stack", "LinkedList"}, 3));
        qList.add(new Question("What is the size of int in Java?",
                new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on OS"}, 2));
        qList.add(new Question("Which method is used to start a thread?",
                new String[]{"run()", "init()", "start()", "execute()"}, 3));
        qList.add(new Question("What is the default value of a boolean variable in Java?",
                new String[]{"true", "false", "0", "null"}, 2));
        qList.add(new Question("What is the parent class of all classes in Java?",
                new String[]{"Object", "Class", "System", "Main"}, 1));
        qList.add(new Question("Which access modifier makes members visible only in the same class?",
                new String[]{"private", "protected", "default", "public"}, 1));
        qList.add(new Question("Which exception is thrown when dividing by zero?",
                new String[]{"ArithmeticException", "NullPointerException", "IOException", "IllegalArgumentException"}, 1));

        // Add more questions to make it 25
        qList.add(new Question("Which loop is guaranteed to execute at least once?",
                new String[]{"for", "while", "do-while", "foreach"}, 3));
        qList.add(new Question("Which operator is used for logical AND?",
                new String[]{"&", "&&", "|", "||"}, 2));
        qList.add(new Question("Which interface provides resizable array in Java?",
                new String[]{"List", "ArrayList", "Set", "Map"}, 2));
        qList.add(new Question("Which is not a Java keyword?",
                new String[]{"volatile", "transient", "include", "native"}, 3));
        qList.add(new Question("Which collection class allows duplicate elements?",
                new String[]{"Set", "Map", "List", "EnumSet"}, 3));
        qList.add(new Question("What is JVM?",
                new String[]{"Java Virtual Machine", "Java Variable Manager", "Just Virtual Machine", "None"}, 1));
        qList.add(new Question("Which keyword is used to create object?",
                new String[]{"new", "create", "make", "init"}, 1));
        qList.add(new Question("Which package contains Scanner class?",
                new String[]{"java.io", "java.util", "java.lang", "java.net"}, 2));
        qList.add(new Question("Which of the following is not a primitive data type?",
                new String[]{"int", "float", "String", "char"}, 3));
        qList.add(new Question("Which method converts string to int?",
                new String[]{"parseInt()", "valueOf()", "convertToInt()", "toInt()"}, 1));

        qList.add(new Question("Which class is used for console input?",
                new String[]{"InputStream", "System.in", "Scanner", "BufferedReader"}, 3));
        qList.add(new Question("Which of these is not a loop structure?",
                new String[]{"for", "do-while", "loop", "while"}, 3));
        qList.add(new Question("Which is used to stop a loop?",
                new String[]{"return", "exit", "stop", "break"}, 4));
        qList.add(new Question("Which keyword is used for inheritance?",
                new String[]{"inherit", "extends", "inherits", "derive"}, 2));
        qList.add(new Question("Which method is called when an object is created?",
                new String[]{"constructor", "method", "main", "object"}, 1));

        return qList;
    }
}
