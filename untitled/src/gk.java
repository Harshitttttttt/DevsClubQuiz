import java.util.ArrayList;
import java.util.Collections;

class gk extends Topic{

    @Override
    String getTopic() {
        return "GK!!!!!!!!!";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> lists = new ArrayList<>();
        String question;
        ArrayList<String> options = new ArrayList<>();

        question = "Entomology is the science that studies?";
        options.add("Behavior of human beings");
        options.add("Insects");
        options.add("The origin and history of technical and scientific terms");
        options.add("The formation of rocks");

        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "Insects"));
        options.clear();

        question = "Garampani sanctuary is located at?";
        options.add("Junagarh, Gujarat");
        options.add("Diphu, Assam");
        options.add("Kohima, Nagaland");
        options.add("Gangtok, Sikkim");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "Diphu, Assam"));
        options.clear();


        question = "For which of the following disciplines is Nobel Prize awarded?";
        options.add("Physics and Chemistry");
        options.add("Physiology or Medicine");
        options.add("Literature, Peace and Economics");
        options.add("All of the above");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "All of the above"));
        options.clear();

        Collections.shuffle(lists);
        return lists;
    }
}