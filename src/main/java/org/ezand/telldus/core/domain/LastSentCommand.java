package org.ezand.telldus.core.domain;

public enum LastSentCommand {
	ON, OFF, DIMMED;

	public static LastSentCommand fromName(final String name) {
		return name == null ? null : valueOf(name);
	}
}
