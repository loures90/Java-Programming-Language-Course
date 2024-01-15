package com.techCourse.java.interfaces;

import java.util.Scanner;

/*
 * The client does not know which method is going to be implemented
 * */

interface VideoPlayer {
	void play(String file);
}

class MP4Player implements VideoPlayer {
	@Override
	public void play(String file) {
		System.out.println("MP4 playing the file : " + file);
	}
}

class MOVPlayer implements VideoPlayer {
	@Override
	public void play(String file) {
		System.out.println("MOV playing the file : " + file);
	}
}

class PlayerFactory {
	public static VideoPlayer getPlayer (String file) {
		if (file.endsWith("mp4")) {
			return new MP4Player();
		} else if (file.endsWith("mov")) {
			return new MOVPlayer();
		} else {
			return null;
		}
	}
}



public class LooseCouplingEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("File: ");
		String file = scan.nextLine();
		VideoPlayer videoPlayer = PlayerFactory.getPlayer(file);
		if (videoPlayer == null) {
			System.out.println("File not valid ");
		} else {
			videoPlayer.play(file);
		}
	}

}
