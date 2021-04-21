///Code by Yago Lacerda C19481114

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	ArrayList<Note> notes = new ArrayList<>();

	public void settings()
	{
		size(1000, 500);

		
	}

	void loadScore() {
        for(int i = 0; i < score.length(); i++) {
            if(score.length()>i) {
                if(Character.isLetter(score.charAt(i))) {
                        if(Character.isDigit(score.charAt(i))) {
                            notes.add(new Note(score.charAt(i),  Character.getNumericValue(score.charAt(i+1))));
                        }else {
                            notes.add(new Note(score.charAt(i), 1));
                        }
                    }
                }
            }
			for(int i = 0; i < notes.size(); i++) {
				println(notes.get(i).getNote(), "- ",notes.get(i).getDur());
			}
        }

	void printScores(){
		for(int i = 0; i < notes.size(); i++) {
        		Note n = notes.get(i);
				print(n.getNote()+"\t"+n.getDur()+"\t");	
				if(n.getDur()==1){
					println("Quaver");

				}	
				else{
					println("Crotchet");
				}
		}
	}
    

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);	

	
	}

	void drawNotes()
	{

	}
}
