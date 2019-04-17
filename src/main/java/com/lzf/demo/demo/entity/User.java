package com.lzf.demo.demo.entity;

import javax.persistence.*;
import java.util.Date;
import java.io.Serializable;
import com.lzf.code.annatation.LzfApiDescribe;
/**
 * 写点注释
 * <br/>
 * Created in 2019-04-03 18:06:12
 * <br/>
 *
 * @author Lzf
 */
@Entity
@Table(name = "bbs_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@LzfApiDescribe(value = "主键")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	/**
	 * 用户名 
	 */
	@LzfApiDescribe(value = "用户名")
	@Column(name = "username")
	private String username;

	/**
	 * 密码，加密存储 
	 */
	@LzfApiDescribe(value = "密码，加密存储")
	@Column(name = "password")
	private String password;

	/**
	 * 注册手机号 
	 */
	@LzfApiDescribe(value = "注册手机号")
	@Column(name = "phone")
	private String phone;

	/**
	 * 注册邮箱 
	 */
	@LzfApiDescribe(value = "注册邮箱")
	@Column(name = "email")
	private String email;

	/**
	 * 创建时间 
	 */
	@LzfApiDescribe(value = "创建时间")
	@Column(name = "create_time")
	private Date createTime;

	/**
	 * 更新时间 
	 */
	@LzfApiDescribe(value = "更新时间")
	@Column(name = "update_time")
	private Date updateTime;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				"}";
	}
}