
public class NumericQuestion extends Question
{
    private double answer;

    /**
     * Default constructor for objects of class NumericQuestion
     */
    public NumericQuestion()
    {
        
    }

    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }

}
