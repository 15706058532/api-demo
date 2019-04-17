package com.lzf.demo.demo.req;

import org.springframework.format.annotation.DateTimeFormat;
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
public class UserReq implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键 
	 */
	@LzfApiDescribe(value = "主键")
	private Long id;

	/**
	 * 用户名 
	 */
	@LzfApiDescribe(value = "用户名")
	private String username;

	/**
	 * 密码，加密存储 
	 */
	@LzfApiDescribe(value = "密码，加密存储")
	private String password;

	/**
	 * 注册手机号 
	 */
	@LzfApiDescribe(value = "注册手机号")
	private String phone;

	/**
	 * 注册邮箱 
	 */
	@LzfApiDescribe(value = "注册邮箱")
	private String email;

	/**
	 * 创建时间 
	 */
	@LzfApiDescribe(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 创建时间 开始值
	 */
	@LzfApiDescribe(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeStart;

	/**
	 * 创建时间 结束值
	 */
	@LzfApiDescribe(value = "创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTimeEnd;

	/**
	 * 更新时间 
	 */
	@LzfApiDescribe(value = "更新时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 更新时间 开始值
	 */
	@LzfApiDescribe(value = "更新时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTimeStart;

	/**
	 * 更新时间 结束值
	 */
	@LzfApiDescribe(value = "更新时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTimeEnd;

	/**
	 * 当前页数 
	 */
	@LzfApiDescribe(value = "当前页数")
	private Integer page;

	/**
	 * 每页条数 
	 */
	@LzfApiDescribe(value = "每页条数")
	private Integer pageSize;

	/**
	 * 排序字段及规则 
	 */
	@LzfApiDescribe(value = "排序字段及规则")
	private Integer orderByClause;

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

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTimeStart(Date updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public Date getUpdateTimeStart() {
		return updateTimeStart;
	}

	public void setUpdateTimeEnd(Date updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	public Date getUpdateTimeEnd() {
		return updateTimeEnd;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPage() {
		return page;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setOrderByClause(Integer orderByClause) {
		this.orderByClause = orderByClause;
	}

	public Integer getOrderByClause() {
		return orderByClause;
	}

	@Override
	public String toString() {
		return "UserReq{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				", page=" + page +
				", pageSize=" + pageSize +
				", orderByClause=" + orderByClause +
				"}";
	}
}