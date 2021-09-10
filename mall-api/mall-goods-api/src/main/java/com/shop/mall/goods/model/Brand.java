package com.shop.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "brand")
public class Brand {

    // ID（主件）
    @TableId(type = IdType.AUTO, value = "id")
    private Integer id;
    // 品牌名称
    private String name;
    // 品牌图片
    private String image;
    // 图片首字母
    private String initial;
    // 排序
    private Integer sort;

}
