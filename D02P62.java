package com.learning.core.day2Session1;


class NotEligibleException extends Exception {
	public NotEligibleException(String message) {
		super(message);
	}
} 
class CricketRating {
	private String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	private String coins;
 
	public CricketRating(String playerName, float critic1, float critic2) {
		this.playerName = playerName;
		this.setCritic1(critic1);
		this.setCritic2(critic2);
		calculateAverageRating(critic1, critic2);
		calculateCoins();
	}
 
	public CricketRating(String playerName, float critic1, float critic2, float critic3) {
		this.playerName = playerName;
		this.setCritic1(critic1);
		this.setCritic2(critic2);
		this.setCritic3(critic3);
		calculateAverageRating(critic1, critic2, critic3);
		calculateCoins();
	}
 
	public void calculateAverageRating(float critic1, float critic2) {
		this.avgRating = (critic1 + critic2) / 2;
	}
 
	public void calculateAverageRating(float critic1, float critic2, float critic3) {
		this.avgRating = (critic1 + critic2 + critic3) / 3;
	}
 
	public String calculateCoins() {
		if (avgRating >= 7) {
			coins = "Gold";
		} else if (avgRating >= 5) {
			coins = "Silver";
		} else if (avgRating >= 2) {
			coins = "Copper";
		} else {
			coins = "NotEligible";
		}
		return coins;
	}
 
	public void display() {
		System.out.println(playerName + " " + avgRating + " " + coins);
	}
 
	public float getCritic1() {
		return critic1;
	}
 
	public void setCritic1(float critic1) {
		this.critic1 = critic1;
	}
 
	public float getCritic2() {
		return critic2;
	}
 
	public void setCritic2(float critic2) {
		this.critic2 = critic2;
	}
 
	public float getCritic3() {
		return critic3;
	}
 
	public void setCritic3(float critic3) {
		this.critic3 = critic3;
	}
}
 
public class D02P62 {
	public static void main(String[] args) throws NotEligibleException {
		CricketRating player1 = new CricketRating("John", 9.3f, 9.67f, 8.7f);
		player1.display();
 
		CricketRating player2 = new CricketRating("Henry", 1.5f, 0);
		player2.display();
	}
}