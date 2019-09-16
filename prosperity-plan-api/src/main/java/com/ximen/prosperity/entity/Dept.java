package com.ximen.prosperity.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;

@TableName(value = "dept")
@Data
public class Dept extends Model<Dept> implements Serializable{
    private static final long serialVersionUID = -3359831061251133117L; //必须序列化
    @TableId(value = "deptno",type = IdType.AUTO)
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    @TableField(value = "db_source")
    private String dsource;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
    public Dept(){}

}

 

 