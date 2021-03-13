package com.schema.models;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Device {

  @Id
  @GeneratedValue
  private int deviceId;
  private String countryCode;
  private String countryName;
  private String county;
  private String deviceRawState;
  private String deviceRawLocId;


  public int getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(int deviceId) {
    this.deviceId = deviceId;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getDeviceRawLocId() {
    return deviceRawLocId;
  }

  public void setDeviceRawLocId(String deviceRawLocId) {
    this.deviceRawLocId = deviceRawLocId;
  }

  public String getDeviceRawState() {
    return deviceRawState;
  }

  public void setDeviceRawState(String deviceRawState) {
    this.deviceRawState = deviceRawState;
  }


}
