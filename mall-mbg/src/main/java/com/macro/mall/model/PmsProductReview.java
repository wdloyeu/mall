package com.macro.mall.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private LocalDateTime createTime;
}