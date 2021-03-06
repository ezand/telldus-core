package org.ezand.telldus.core.domain;

import static com.google.common.collect.Sets.newHashSet;
import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Device {
	private static final Set<String> DEVICE_KEYS = newHashSet("id", "name", "lastsentcommand", "type");

	private final Integer id;
	private final String name;
	private final LastSentCommand lastSentCommand;
	private final Map<String, String> properties;

	public Device(final Map<String, String> properties) {
		this.id = parseInt(properties.get("id"));
		this.name = properties.get("name");
		this.lastSentCommand = LastSentCommand.fromName(properties.get("lastsentcommand"));
		this.properties = properties.entrySet().stream()
				.filter(e -> !DEVICE_KEYS.contains(e.getKey()))
				.collect(toMap(Entry::getKey, Entry::getValue));
	}

	/**
	 * @return the device id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the last sent command as a {@link LastSentCommand}.
	 */
	public LastSentCommand getLastSentCommand() {
		return lastSentCommand;
	}

	/**
	 * @return the name of the device.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the device specific properties.
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public String toString() {
		return "Device{" +
				"id=" + id +
				", name='" + name + '\'' +
				", lastSentCommand=" + lastSentCommand +
				", properties=" + properties +
				'}';
	}
}
