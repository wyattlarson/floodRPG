/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;
import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Ryan Call
 */
public class QuestionScene extends BuildingScene implements Serializable {
    
    //------------------------------QuestionScene Attributes------------------------------//

    private String questionPrompt;
    
    //------------------------------Associations------------------------------//
    //Association between QuestionScene and Equation
     private Equation[] equation;
                public Equation[] getEquation() {
                    return equation;
                }
                public void setEquation(Equation[] equation) {
                    this.equation = equation;
                }

    
    
//------------------------------Public Functions------------------------------//
//constructor function
    public QuestionScene() {
    
    }

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public void setQuestionPrompt(String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }

    //------------------------------Overrides------------------------------//

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.questionPrompt);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "questionPrompt=" + questionPrompt + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionScene other = (QuestionScene) obj;
        if (!Objects.equals(this.questionPrompt, other.questionPrompt)) {
            return false;
        }
        return true;
    }
    
}
