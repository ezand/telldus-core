# telldus-core
Core library for the Telldus Java wrapper

[![Build Status](https://travis-ci.org/ezand/telldus-core.svg?branch=master)](https://travis-ci.org/ezand/telldus-core)
[![Javadoc](http://javadoc-badge.appspot.com/org.ezand.telldus/telldus-core.svg?label=telldus-core)](http://ezand.org/javadocs/telldus-core/release/1.1/)

# Build Tools
### Maven
    <dependency>
        <groupId>org.ezand.telldus</groupId>
        <artifactId>telldus-core</artifactId>
        <version>1.1</version>
    </dependency>

### Gradle
    runtime group: 'org.ezand.telldus', name: 'telldus-core', version: '1.1'

### Leiningen
    [org.ezand.telldus/telldus-core "1.1"]

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
    <td>Holds sensors information, ex. temperature and weather data.</td>
  </tr>
  <tr>
    <td>State</td>
    <td>
      <ul>
        <li>For switches the state will be a RichBoolean instance.</li>
        <li>For dimmers the state will be a RichBoolean instance or the dim-level (0-255), depending on the last command sent to the dim-device.</li>
      </ul>
    </td>
  </tr>
</table>
