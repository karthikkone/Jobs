package com.jenkinsjobs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long buildid;
	private String buildname;
	private String buildstatus;
	private String log;
	@Override
	public String toString() {
		return "JobStatus [buildid=" + buildid + ", buildname=" + buildname + ", buildstatus=" + buildstatus + ", log="
				+ log + "]";
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public JobStatus()
	{
		
	}
	public JobStatus(String buildname, String buildstatus) {
		super();
		//this.buildid = buildid;
		this.buildname = buildname;
		this.buildstatus = buildstatus;
	}
	
	public Long getBuildid() {
		return buildid;
	}
	public void setBuildid(Long buildid) {
		this.buildid = buildid;
	}
	public String getBuildname() {
		return buildname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildid == null) ? 0 : buildid.hashCode());
		result = prime * result + ((buildname == null) ? 0 : buildname.hashCode());
		result = prime * result + ((buildstatus == null) ? 0 : buildstatus.hashCode());
		result = prime * result + ((log == null) ? 0 : log.hashCode());
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
		JobStatus other = (JobStatus) obj;
		if (buildid == null) {
			if (other.buildid != null)
				return false;
		} else if (!buildid.equals(other.buildid))
			return false;
		if (buildname == null) {
			if (other.buildname != null)
				return false;
		} else if (!buildname.equals(other.buildname))
			return false;
		if (buildstatus == null) {
			if (other.buildstatus != null)
				return false;
		} else if (!buildstatus.equals(other.buildstatus))
			return false;
		if (log == null) {
			if (other.log != null)
				return false;
		} else if (!log.equals(other.log))
			return false;
		return true;
	}
	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}
	public String getBuildstatus() {
		return buildstatus;
	}
	public void setBuildstatus(String buildstatus) {
		this.buildstatus = buildstatus;
	}
	
	
	
}
