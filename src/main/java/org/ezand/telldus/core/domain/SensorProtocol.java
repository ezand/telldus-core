package org.ezand.telldus.core.domain;

public enum SensorProtocol {
	MANDOLYN, FINEOFFSET;

	public static SensorProtocol fromName(final String name) {
		return name == null ? null : valueOf(name.toUpperCase());
	}
}
