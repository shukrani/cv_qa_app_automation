package com.craftsvilla.mobileAppAutomation.dataobjects;

public class Browsers {
	String osName;
	String browsername;
	String version;

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getBrowsername() {
		return browsername;
	}

	public void setBrowsername(String browsername) {
		this.browsername = browsername;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Browsers [osName=" + osName + ", browsername=" + browsername + ", version=" + version + "]";
	}

	public Browsers(String osName, String browsername, String version) {
		super();
		this.osName = osName;
		this.browsername = browsername;
		this.version = version;
	}

}