/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author wyatt
 */

//------------------------------Player Attributes------------------------------//
public class Player implements Serializable{
    private String name;
    private String lastDatePlayed;
    private int bestScore;

    //------------------------------Associations-----------------------------//
    //Association between Game and Player
    private ArrayList<Game> games = new ArrayList<Game>();
            public ArrayList<Game> getGames() {
                return games;
            }
            public void setGames(ArrayList<Game> games) {
                this.games = games;
            }
     //Assoiciation between Player and Character
      private ArrayList<Character> characters = new ArrayList<Character>();
            public ArrayList<Character> getCharacters() {
                return characters;
            }
            public void setCharacters(ArrayList<Character> characters) {
                this.characters = characters;
            }
            
     //------------------------------Public Functions------------------------------//
    //Constructor
    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastDatePlayed() {
        return lastDatePlayed;
    }

    public void setLastDatePlayed(String lastDatePlayed) {
        this.lastDatePlayed = lastDatePlayed;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }
    
//------------------------------Overrides------------------------------//
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.lastDatePlayed);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", date=" + lastDatePlayed + ", bestScore=" + bestScore + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestScore) != Double.doubleToLongBits(other.bestScore)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastDatePlayed, other.lastDatePlayed)) {
            return false;
        }
        return true;
    }
   
    
}
