package javaex.api.objectclass.v1;

import java.util.Arrays;


	public class Scoreboard implements Cloneable {

	private int scores[]; //참조타입필드

	//생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	public static void main(String[] args) {
	}
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
