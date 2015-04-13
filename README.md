# telldus-java
Java wrapper around the Telldus CLI (tdtool). This is a work in progress, improvements are accepted through pull-requests :)

[![Build Status](https://travis-ci.org/ezand/telldus-core.svg?branch=master)](https://travis-ci.org/ezand/telldus-core)
[![Javadoc](http://javadoc-badge.appspot.com/org.ezand.telldus/telldus-core.svg?label=javadoc)](http://ezand.org/javadocs/telldus-core/release/1.0/)

# Build Tools
### Maven
    <dependency>
        <groupId>org.ezand.telldus</groupId>
        <artifactId>telldus-core</artifactId>
        <version>1.0</version>
    </dependency>

### Gradle
    runtime group: 'org.ezand.telldus', name: 'telldus-core', version: '1.0'

### Leiningen
    [org.ezand.telldus/telldus-core "1.0"]

# Main domain objects
<table>
  <tr>
    <th>Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Device</td>
    <td>Holds device information, ex. info about switches and dimmers.</td>
  </tr>
  <tr>
    <td>Sensor</td>
    <td>Holds sensors information, ex. temperature and weather data</td>
  </tr>
  <tr>
    <td>State</td>
    <td>Holds the device state, ex. 'on' or 'off' for switches and the dim level (0-255) for dimmers. State has a type of currently UNKNOWN, SWITCH or DIMMER (more will be supported later)</td>
  </tr>
</table>
