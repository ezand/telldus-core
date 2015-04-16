package org.ezand.telldus.core.util;

import static com.google.common.collect.Sets.newHashSet;
import static java.lang.Boolean.parseBoolean;
import static java.lang.String.format;
import static java.lang.String.valueOf;

import java.util.Set;

public class RichBoolean {
	public static final String TRUE = "true";
	public static final String FALSE = "false";
	public static final String ON = "on";
	public static final String OFF = "off";
	public static final String YES = "yes";
	public static final String NO = "no";
	public static final Set<String> POSITIVES = newHashSet(TRUE, YES, ON);
	public static final Set<String> NEGATIVES = newHashSet(FALSE, NO, OFF);

	private static final Set<String> VALID_VALUES = newHashSet(TRUE, FALSE, ON, OFF, YES, NO);

	private final String value;

	public RichBoolean(final boolean value) {
		this(valueOf(value));
	}

	public RichBoolean(final String value) {
		if (!VALID_VALUES.contains(value.toLowerCase())) {
			throw new IllegalArgumentException(format("%s is not a valid rich-boolean-value", value));
		}

		this.value = value.toLowerCase();
	}

	public boolean asBoolean() {
		if (value.equalsIgnoreCase(TRUE) || value.equalsIgnoreCase(FALSE)) {
			return parseBoolean(value);
		} else {
			return POSITIVES.contains(this.value);
		}
	}

	public String asOnOff() {
		return asBoolean() ? ON : OFF;
	}

	public String asYesNo() {
		return asBoolean() ? YES : NO;
	}

	public boolean isPositive() {
		return POSITIVES.contains(this.value);
	}

	public boolean isNegative() {
		return NEGATIVES.contains(this.value);
	}

	public static boolean isValid(final String value) {
		return VALID_VALUES.contains(value.toLowerCase());
	}
}
