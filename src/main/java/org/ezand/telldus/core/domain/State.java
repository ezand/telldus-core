package org.ezand.telldus.core.domain;

public class State<T> {
	private final Type type;
	private final T state;

	public State(final Type type, final T state) {
		this.type = type;
		this.state = state;
	}

	/**
	 * @return an object with the device state. Can hold different values based on the type of device.
	 */
	public T getState() {
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
