package com.macro.mall.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("pms_product_review")
public class PmsProductReview {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    
    private Long productId;
    
    private Long memberId;
    
    private Integer star;
    
    private String content;
    
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
}
