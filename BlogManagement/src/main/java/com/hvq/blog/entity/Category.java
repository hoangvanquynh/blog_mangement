package com.hvq.blog.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity{
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long categoryId;
	private String categoryName;
	private String slug;
	private String description;
//	private Date createAt;
//	private Date updateAt;
	
	@ManyToMany(mappedBy = "categories")
	private Set<Post> posts;
	
//	public Long getCategoryId() {
//		return categoryId;
//	}
//	public void setCategoryId(Long categoryId) {
//		this.categoryId = categoryId;
//	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
//	public Date getCreateAt() {
//		return createAt;
//	}
//	public void setCreateAt(Date createAt) {
//		this.createAt = createAt;
//	}
//	public Date getUpdateAt() {
//		return updateAt;
//	}
//	public void setUpdateAt(Date updateAt) {
//		this.updateAt = updateAt;
//	}
//	
}
