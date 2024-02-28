package com.techCourse.java.Enums;

enum State {
	STARTING,
	RUNNING,
	STOP,
}

class Machine {
	private State state;
	
	public Machine() {
		state = State.STARTING;
	}
	
	public void setState(State newState) {
		this.state = newState;
	}
	
	public State getState() {
		return state;
	}
}

public class EnumsEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m = new Machine();
		m.setState(State.RUNNING);
		System.out.println(m.getState());
	}

}
