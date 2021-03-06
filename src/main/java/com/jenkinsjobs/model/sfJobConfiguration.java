package com.jenkinsjobs.model;

public class sfJobConfiguration {
	private String jobName;
	private String description;
	private String buildTargets;
	private String sourceOrgCredentialId;
	private String targetOrgCredentialId;
	
	
	public sfJobConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSourceOrgCredentialId() {
		return sourceOrgCredentialId;
	}
	public void setSourceOrgCredentialId(String sourceOrgCredentialId) {
		this.sourceOrgCredentialId = sourceOrgCredentialId;
	}
	public String getTargetOrgCredentialId() {
		return targetOrgCredentialId;
	}
	public void setTargetOrgCredentialId(String targetOrgCredentialId) {
		this.targetOrgCredentialId = targetOrgCredentialId;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildTargets == null) ? 0 : buildTargets.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((jobName == null) ? 0 : jobName.hashCode());
		result = prime * result + ((sourceOrgCredentialId == null) ? 0 : sourceOrgCredentialId.hashCode());
		result = prime * result + ((targetOrgCredentialId == null) ? 0 : targetOrgCredentialId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sfJobConfiguration other = (sfJobConfiguration) obj;
		if (buildTargets == null) {
			if (other.buildTargets != null)
				return false;
		} else if (!buildTargets.equals(other.buildTargets))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (jobName == null) {
			if (other.jobName != null)
				return false;
		} else if (!jobName.equals(other.jobName))
			return false;
		if (sourceOrgCredentialId == null) {
			if (other.sourceOrgCredentialId != null)
				return false;
		} else if (!sourceOrgCredentialId.equals(other.sourceOrgCredentialId))
			return false;
		if (targetOrgCredentialId == null) {
			if (other.targetOrgCredentialId != null)
				return false;
		} else if (!targetOrgCredentialId.equals(other.targetOrgCredentialId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "sfJobConfiguration [jobName=" + jobName + ", description=" + description + ", buildTargets="
				+ buildTargets + ", sourceOrgCredentialId=" + sourceOrgCredentialId + ", targetOrgCredentialId="
				+ targetOrgCredentialId + "]";
	}
	public String getBuildTargets() {
		return buildTargets;
	}
	public void setBuildTargets(String buildTargets) {
		this.buildTargets = buildTargets;
	}
	
	
}
