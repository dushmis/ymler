package com.dushyant.xml;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	String id = (Calendar.getInstance().getTimeInMillis()) + "";
	String name;
	@XmlElement(name = "function", type = Function.class)
	List<Function> functions;
	String documentLocation;
	String date;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((documentLocation == null) ? 0 : documentLocation.hashCode());
		result = prime * result + ((functions == null) ? 0 : functions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Project)) {
			return false;
		}
		Project other = (Project) obj;
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (documentLocation == null) {
			if (other.documentLocation != null) {
				return false;
			}
		} else if (!documentLocation.equals(other.documentLocation)) {
			return false;
		}
		if (functions == null) {
			if (other.functions != null) {
				return false;
			}
		} else if (!functions.equals(other.functions)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
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
	 * @return the functions
	 */
	public final List<Function> getFunctions() {
		return functions;
	}

	/**
	 * @param functions
	 *            the functions to set
	 */
	public final void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	/**
	 * @return the documentLocation
	 */
	public final String getDocumentLocation() {
		return documentLocation;
	}

	/**
	 * @param documentLocation
	 *            the documentLocation to set
	 */
	public final void setDocumentLocation(String documentLocation) {
		this.documentLocation = documentLocation;
	}

	/**
	 * @return the date
	 */
	public final String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public final void setDate(String date) {
		this.date = date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [" + (name != null ? "name=" + name + ", " : "") + (functions != null ? "functions=" + functions + ", " : "") + (documentLocation != null ? "documentLocation=" + documentLocation + ", " : "") + (date != null ? "date=" + date : "") + "]";
	}

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	final void setId(String id) {
		this.id = id;
	}

}
