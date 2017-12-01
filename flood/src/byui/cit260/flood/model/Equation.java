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
public class Equation implements Serializable {
//------------------------------Equation Attributes------------------------------//

    private String question;
    private String Answer;
//------------------------------Associations------------------------------//
    // associatin between equation scene and question scene//
    private QuestionScene questionScene;

    public QuestionScene getQuestionScene() {
        return questionScene;
    }

    public void setQuestionScene(QuestionScene questionScene) {
        this.questionScene = questionScene;
    }

//------------------------------Public Functions------------------------------//
//------------------------------constructor function-------------------------//
    public Equation() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.question);
        hash = 23 * hash + Objects.hashCode(this.Answer);
        return hash;
    }
//------------------------------Overrides------------------------------//

    @Override
    public String toString() {
        return "Equation{" + "question=" + question + ", Answer=" + Answer + ", questionScene=" + questionScene + '}';
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
        final Equation other = (Equation) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.Answer, other.Answer)) {
            return false;
        }
        return true;
    }

}
