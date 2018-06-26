package com.example.userservice.user.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
public class User implements Serializable{

	private static final long serialVersionUID = 4035622613913351358L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	
	protected String userName;
	
	protected String password;
	
	protected String phone;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	protected Date createTime;
	
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	protected Date lastLoginTime;
	

}
