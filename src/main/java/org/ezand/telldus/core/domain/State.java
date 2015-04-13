package org.ezand.telldus.core.domain;

public class State {
	private final Type type;
	private final String state;

	public State(final Type type, final String state) {
		this.type = type;
		this.state = state;
	}

	/**
	 * @return a string with the device state. Can hold different values based on the type of device.
	 */
	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "State{" +
				"state='" + state + '\'' +
				", type=" + type +
				'}';
	}

	public Type getType() {
		return type;
	}
}
