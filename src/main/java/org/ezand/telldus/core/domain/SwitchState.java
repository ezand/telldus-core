package org.ezand.telldus.core.domain;

public enum SwitchState {
	ON, OFF;

	public String lowerName() {
		return name().toLowerCase();
	}
}
