package org.ezand.telldus.core.repository;

import java.util.List;

import org.ezand.telldus.core.TelldusException;
import org.ezand.telldus.core.domain.Device;
import org.ezand.telldus.core.domain.Sensor;
import org.ezand.telldus.core.domain.State;

public interface TelldusRepository {
	List<Device> getDevices() throws TelldusException;

	State getDeviceState(int id) throws TelldusException;

	State turnDeviceOn(int id) throws TelldusException;

	State turnDeviceOff(int id) throws TelldusException;

	State dimDevice(int id, int level) throws TelldusException;

	List<Sensor> getSensors() throws TelldusException;
}
