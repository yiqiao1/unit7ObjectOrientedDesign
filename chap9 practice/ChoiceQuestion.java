
public class ChoiceQuestion extends Question
{
    private int numOfChoices;

    // choice question is displayed as the text of the question and a list of choices
    // example:
    //  "What are the primary colors of light?"
    //  1) red, blue, yellow
    //  2) red, blue, green
    //  3) purple, pink, orange
    //
    public ChoiceQuestion()
    {
        super();
        numOfChoices = 0;
    }

    public void addChoice(String choice, boolean correct)
    {
        numOfChoices++;
        
        super.addText("\n" + numOfChoices + ") " + choice);
        
        if (correct)
        {
            String answerString = "" + numOfChoices;
            super.setAnswer(answerString);
        }

    }
    
}
