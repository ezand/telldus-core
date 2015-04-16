package org.ezand.telldus.core.domain;

public class State<T> {
	private final T state;

	public State(final T state) {
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
				'}';
	}
}
