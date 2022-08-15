import java.util.ArrayList;
import java.util.Collections;

class geo extends Topic{

    @Override
    String getTopic() {
        return "Geography!!!!";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> lists = new ArrayList<>();
        String question;
        ArrayList<String> options = new ArrayList<>();

        question = "The shape of earth is?";
        options.add("sphere");
        options.add("oblate spheroid");
        options.add("circular");
        options.add("spheroid");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "oblate spheroid"));
        options.clear();

        question = "The type of igneous rock that form from magma is a function of?";
        options.add("the chemical composition of the magma");
        options.add("temperature of solidification");
        options.add("the rate of cooling, which influences the crystallisation process");
        options.add("All of the above");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "All of the above"));
        options.clear();


        question = "The smallest country of the world is?";
        options.add("Russia");
        options.add("Vatican city");
        options.add("Brazil");
        options.add("Canada");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question, new ArrayList<String>(options), "Vatican city"));
        options.clear();

        Collections.shuffle(lists);
        return lists;
    }
}