package com.example.demo.algorithm.ztl.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUsers<M extends BaseUsers<M>> extends Model<M> implements IBean {

	public void setId(Long id) {
		set("id", id);
	}

	public Long getId() {
		return getLong("id");
	}

	public void setPrefList(String prefList) {
		set("pref_list", prefList);
	}

	public String getPrefList() {
		return getStr("pref_list");
	}

	public void setLatestLogTime(java.util.Date latestLogTime) {
		set("latest_log_time", latestLogTime);
	}

	public java.util.Date getLatestLogTime() {
		return getDate("latest_log_time");
	}

	public void setName(String name) {
		set("name", name);
	}

	public String getName() {
		return getStr("name");
	}
	
}
