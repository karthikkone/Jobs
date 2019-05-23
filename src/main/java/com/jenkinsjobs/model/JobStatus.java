package com.jenkinsjobs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.sf.json.JSONObject;

@Entity
public class JobStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long buildid;	
	private String buildname;
	private String buildstatus;		
	private JSONObject logs = null;
	
	public JobStatus()
	{
		
	}
	public JobStatus(String buildname, String buildstatus) {
		super();
		//this.buildid = buildid;
		this.buildname = buildname;
		this.buildstatus = buildstatus;
	}
	public JSONObject getLogs() {
		return logs;
	}
	public void setLogs(JSONObject logs) {
		this.logs = logs;
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
