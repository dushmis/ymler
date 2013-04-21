package com.dushyant.xml;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Projects implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "project", type = Project.class)
	private List<Project> projectList;

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
		if (!(obj instanceof Projects)) {
			return false;
		}
		Projects other = (Projects) obj;
		if (projectList == null) {
			if (other.projectList != null) {
				return false;
			}
		} else if (!projectList.equals(other.projectList)) {
			return false;
		}
		return true;
	}

	public List<Project> getProjectList() {
		return projectList;
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
		result = prime * result + ((projectList == null) ? 0 : projectList.hashCode());
		return result;
	}

	public void setProjectList(List<Project> projects) {
		this.projectList = projects;
	}

	@Override
	public String toString() {
		return "Projects [getProjects()=" + getProjectList() + "]";
	}

}
