package domain;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  private String id     ;//int(11) NOT NULL DEFAULT '1',
	  private String name    ;// varchar(50) DEFAULT '张三',
	  private String birthday;// datetime DEFAULT CURRENT_TIMESTAMP,
	  private String newsex  ;// varchar(10) DEFAULT '女',
	  private String roleid  ;// int(8) NOT NULL DEFAULT '1',
	  public String getId() {
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNewsex() {
		return newsex;
	}
	public void setNewsex(String newsex) {
		this.newsex = newsex;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
	public String getGradeid() {
		return gradeid;
	}
	public void setGradeid(String gradeid) {
		this.gradeid = gradeid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String gradeid ;//int(8) NOT NULL DEFAULT '1',
}
