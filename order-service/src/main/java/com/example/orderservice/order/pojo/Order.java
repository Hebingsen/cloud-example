package com.example.orderservice.order.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString
@Table(name = "t_order")
public class Order implements Serializable{

	private static final long serialVersionUID = 4035622613913351358L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	
	protected String orderNo;

    protected Long userId;
	
}
