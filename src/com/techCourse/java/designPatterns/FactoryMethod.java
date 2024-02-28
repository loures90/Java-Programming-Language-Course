package com.techCourse.java.designPatterns;

interface VideoPlayer {
	public void play();
}


class MP4Player implements VideoPlayer{
	public void play() {
		System.out.println("MP4 is playing!");
	}
}

class MOVPlayer implements VideoPlayer {
	public void play() {
		System.out.println("MP4 is playing!");
	}
}


class PlayerFactory {
	public VideoPlayer play(String player) {
		if (player == "MP4") {
			return new MP4Player();
		} else if (player == "MOV") {
			return new MOVPlayer();
		}
		else return null;
	}
}


public class FactoryMethod {

	public static void main(String[] args) {
		PlayerFactory playerFactory = new PlayerFactory(); 
		playerFactory.play("MP4");
	}
}
