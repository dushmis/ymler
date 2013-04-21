package com.dushyant.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ages")
public class Age implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	String time;
	String what;
	Long a;

	public Age() {
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the time
	 */
	public final String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public final void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the what
	 */
	public final String getWhat() {
		return what;
	}

	/**
	 * @param what
	 *            the what to set
	 */
	public final void setWhat(String what) {
		this.what = what;
	}

	/**
	 * @return the a
	 */
	public final Long getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public final void setA(Long a) {
		this.a = a;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Age [" + (name != null ? "name=" + name + ", " : "") + (time != null ? "time=" + time + ", " : "") + (what != null ? "what=" + what + ", " : "") + (a != null ? "a=" + a : "") + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((what == null) ? 0 : what.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Age other = (Age) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (what == null) {
			if (other.what != null)
				return false;
		} else if (!what.equals(other.what))
			return false;
		return true;
	}

	/**
	 * @param name
	 * @param time
	 * @param what
	 * @param a
	 */
	public Age(String name, String time, String what, Long a) {
		super();
		this.name = name;
		this.time = time;
		this.what = what;
		this.a = a;
	}

}
