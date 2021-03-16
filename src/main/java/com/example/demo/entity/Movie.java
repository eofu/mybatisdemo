package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Movie)
 *
 * @author makejava
 * @since 2021-03-16 14:24:57
 */
public class Movie implements Serializable {
	private static final long serialVersionUID = 134242324428230290L;

	private Long id;

	private String title;

	private String picUrl;

	private String targetUrl;

	private String introduction;

	private String downloadUrl;

	private Date createTime;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"\nid=" + id +
				", \ntitle='" + title + '\'' +
				", \npicUrl='" + picUrl + '\'' +
				", \ntargetUrl='" + targetUrl + '\'' +
				", \nintroduction='" + introduction + '\'' +
				", \ndownloadUrl='" + downloadUrl + '\'' +
				", \ncreateTime=" + createTime +
				'}';
	}
}
