package com.dushyant.xml;

import java.io.Serializable;

public class Function implements Serializable {
	private static final long serialVersionUID = 1L;
	private String functionName;
	private String functionDescription;
	private String functionType;

	public Function() {
	}

	public final String getFunctionName() {
		return functionName;
	}

	public final void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((functionDescription == null) ? 0 : functionDescription.hashCode());
		result = prime * result + ((functionName == null) ? 0 : functionName.hashCode());
		result = prime * result + ((functionType == null) ? 0 : functionType.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
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
		if (!(obj instanceof Function)) {
			return false;
		}
		Function other = (Function) obj;
		if (functionDescription == null) {
			if (other.functionDescription != null) {
				return false;
			}
		} else if (!functionDescription.equals(other.functionDescription)) {
			return false;
		}
		if (functionName == null) {
			if (other.functionName != null) {
				return false;
			}
		} else if (!functionName.equals(other.functionName)) {
			return false;
		}
		if (functionType == null) {
			if (other.functionType != null) {
				return false;
			}
		} else if (!functionType.equals(other.functionType)) {
			return false;
		}
		return true;
	}

	public final String getFunctionDescription() {
		return functionDescription;
	}

	public final void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public final String getFunctionType() {
		return functionType;
	}

	public final void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	/**
	 * @param functionName
	 * @param functionDescription
	 * @param functionType
	 */
	public Function(String functionName, String functionDescription, String functionType) {
		super();
		this.functionName = functionName;
		this.functionDescription = functionDescription;
		this.functionType = functionType;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Function [" + (functionName != null ? "functionName=" + functionName + ", " : "") + (functionDescription != null ? "functionDescription=" + functionDescription + ", " : "")
				+ (functionType != null ? "functionType=" + functionType : "") + "]";
	}

}
