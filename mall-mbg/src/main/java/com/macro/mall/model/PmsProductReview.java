package com.macro.mall.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("pms_product_review")
public class PmsProductReview implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long productId;

    private Long memberId;

    @Schema(title = "评价星数：1-5")
    private Integer star;

    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private static final long serialVersionUID = 1L;
}
