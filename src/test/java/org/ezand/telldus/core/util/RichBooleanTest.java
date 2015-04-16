package org.ezand.telldus.core.util;

import static org.ezand.telldus.core.util.RichBoolean.NO;
import static org.ezand.telldus.core.util.RichBoolean.OFF;
import static org.ezand.telldus.core.util.RichBoolean.ON;
import static org.ezand.telldus.core.util.RichBoolean.YES;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class RichBooleanTest {
	@Test
	public void on_should_be_true() {
		assertThat(new RichBoolean("on").asBoolean(), is(true));
		assertThat(new RichBoolean("ON").asBoolean(), is(true));
		assertThat(new RichBoolean("On").asBoolean(), is(true));
	}

	@Test
	public void on_should_be_on() {
		assertThat(new RichBoolean("on").asOnOff(), is(ON));
		assertThat(new RichBoolean("ON").asOnOff(), is(ON));
		assertThat(new RichBoolean("On").asOnOff(), is(ON));
	}

	@Test
	public void on_should_be_yes() {
		assertThat(new RichBoolean("on").asYesNo(), is(YES));
		assertThat(new RichBoolean("ON").asYesNo(), is(YES));
		assertThat(new RichBoolean("On").asYesNo(), is(YES));
	}

	@Test
	public void on_should_be_positive() {
		assertThat(new RichBoolean("on").isPositive(), is(true));
		assertThat(new RichBoolean("ON").isPositive(), is(true));
		assertThat(new RichBoolean("On").isPositive(), is(true));
	}

	@Test
	public void on_should_be_valid() {
		assertThat(RichBoolean.isValid("on"), is(true));
	}

	@Test
	public void yes_should_be_true() {
		assertThat(new RichBoolean("yes").asBoolean(), is(true));
		assertThat(new RichBoolean("YES").asBoolean(), is(true));
		assertThat(new RichBoolean("Yes").asBoolean(), is(true));
	}

	@Test
	public void yes_should_be_on() {
		assertThat(new RichBoolean("yes").asOnOff(), is(ON));
		assertThat(new RichBoolean("YES").asOnOff(), is(ON));
		assertThat(new RichBoolean("Yes").asOnOff(), is(ON));
	}

	@Test
	public void yes_should_be_yes() {
		assertThat(new RichBoolean("yes").asYesNo(), is(YES));
		assertThat(new RichBoolean("YES").asYesNo(), is(YES));
		assertThat(new RichBoolean("Yes").asYesNo(), is(YES));
	}

	@Test
	public void yes_should_be_positive() {
		assertThat(new RichBoolean("yes").isPositive(), is(true));
		assertThat(new RichBoolean("YES").isPositive(), is(true));
		assertThat(new RichBoolean("Yes").isPositive(), is(true));
	}

	@Test
	public void yes_should_be_valid() {
		assertThat(RichBoolean.isValid("yes"), is(true));
	}

	@Test
	public void true_should_be_true() {
		assertThat(new RichBoolean("true").asBoolean(), is(true));
		assertThat(new RichBoolean("TRUE").asBoolean(), is(true));
		assertThat(new RichBoolean("True").asBoolean(), is(true));
		assertThat(new RichBoolean(true).asBoolean(), is(true));
	}

	@Test
	public void true_should_be_on() {
		assertThat(new RichBoolean("true").asOnOff(), is(ON));
		assertThat(new RichBoolean("TRUE").asOnOff(), is(ON));
		assertThat(new RichBoolean("True").asOnOff(), is(ON));
		assertThat(new RichBoolean(true).asOnOff(), is(ON));
	}

	@Test
	public void true_should_be_yes() {
		assertThat(new RichBoolean("true").asYesNo(), is(YES));
		assertThat(new RichBoolean("TRUE").asYesNo(), is(YES));
		assertThat(new RichBoolean("True").asYesNo(), is(YES));
		assertThat(new RichBoolean(true).asYesNo(), is(YES));
	}

	@Test
	public void true_should_be_positive() {
		assertThat(new RichBoolean("true").isPositive(), is(true));
		assertThat(new RichBoolean("TRUE").isPositive(), is(true));
		assertThat(new RichBoolean("True").isPositive(), is(true));
		assertThat(new RichBoolean(true).isPositive(), is(true));
	}

	@Test
	public void true_should_be_valid() {
		assertThat(RichBoolean.isValid("true"), is(true));
	}

	@Test
	public void off_should_be_false() {
		assertThat(new RichBoolean("off").asBoolean(), is(false));
		assertThat(new RichBoolean("OFF").asBoolean(), is(false));
		assertThat(new RichBoolean("Off").asBoolean(), is(false));
	}

	@Test
	public void off_should_be_off() {
		assertThat(new RichBoolean("off").asOnOff(), is(OFF));
		assertThat(new RichBoolean("OFF").asOnOff(), is(OFF));
		assertThat(new RichBoolean("Off").asOnOff(), is(OFF));
	}

	@Test
	public void off_should_be_no() {
		assertThat(new RichBoolean("off").asYesNo(), is(NO));
		assertThat(new RichBoolean("OFF").asYesNo(), is(NO));
		assertThat(new RichBoolean("Off").asYesNo(), is(NO));
	}

	@Test
	public void off_should_be_negative() {
		assertThat(new RichBoolean("off").isNegative(), is(true));
		assertThat(new RichBoolean("OFF").isNegative(), is(true));
		assertThat(new RichBoolean("Off").isNegative(), is(true));
	}

	@Test
	public void off_should_be_valid() {
		assertThat(RichBoolean.isValid("off"), is(true));
	}

	@Test
	public void no_should_be_false() {
		assertThat(new RichBoolean("no").asBoolean(), is(false));
		assertThat(new RichBoolean("NO").asBoolean(), is(false));
		assertThat(new RichBoolean("No").asBoolean(), is(false));
	}

	@Test
	public void no_should_be_off() {
		assertThat(new RichBoolean("no").asOnOff(), is(OFF));
		assertThat(new RichBoolean("NO").asOnOff(), is(OFF));
		assertThat(new RichBoolean("No").asOnOff(), is(OFF));
	}

	@Test
	public void no_should_be_no() {
		assertThat(new RichBoolean("no").asYesNo(), is(NO));
		assertThat(new RichBoolean("NO").asYesNo(), is(NO));
		assertThat(new RichBoolean("No").asYesNo(), is(NO));
	}

	@Test
	public void no_should_be_negative() {
		assertThat(new RichBoolean("no").isNegative(), is(true));
		assertThat(new RichBoolean("NO").isNegative(), is(true));
		assertThat(new RichBoolean("No").isNegative(), is(true));
	}

	@Test
	public void no_should_be_valid() {
		assertThat(RichBoolean.isValid("no"), is(true));
	}

	@Test
	public void false_should_be_false() {
		assertThat(new RichBoolean("false").asBoolean(), is(false));
		assertThat(new RichBoolean("FALSE").asBoolean(), is(false));
		assertThat(new RichBoolean("False").asBoolean(), is(false));
		assertThat(new RichBoolean(false).asBoolean(), is(false));
	}

	@Test
	public void false_should_be_off() {
		assertThat(new RichBoolean("false").asOnOff(), is(OFF));
		assertThat(new RichBoolean("FALSE").asOnOff(), is(OFF));
		assertThat(new RichBoolean("False").asOnOff(), is(OFF));
		assertThat(new RichBoolean(false).asOnOff(), is(OFF));
	}

	@Test
	public void false_should_be_no() {
		assertThat(new RichBoolean("false").asYesNo(), is(NO));
		assertThat(new RichBoolean("FALSE").asYesNo(), is(NO));
		assertThat(new RichBoolean("False").asYesNo(), is(NO));
		assertThat(new RichBoolean(false).asYesNo(), is(NO));
	}

	@Test
	public void false_should_be_negative() {
		assertThat(new RichBoolean("false").isNegative(), is(true));
		assertThat(new RichBoolean("FALSE").isNegative(), is(true));
		assertThat(new RichBoolean("False").isNegative(), is(true));
		assertThat(new RichBoolean(false).isNegative(), is(true));
	}

	@Test
	public void false_should_be_valid() {
		assertThat(RichBoolean.isValid("false"), is(true));
	}

	@Test
	public void should_not_be_valid() {
		assertThat(RichBoolean.isValid("invalid_value"), is(false));
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_on_invalid_value() {
		new RichBoolean("invalid_value");
	}
}
