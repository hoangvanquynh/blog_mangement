package com.hvq.blog.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Comment extends BaseEntity{

	private String content;
	private String postBy;
	private Date deleteBy;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPostBy() {
		return postBy;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	public Date getDeleteBy() {
		return deleteBy;
	}

	public void setDeleteBy(Date deleteBy) {
		this.deleteBy = deleteBy;
	}

}
