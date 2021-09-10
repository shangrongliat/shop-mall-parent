package com.shop.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.mall.goods.model.Brand;
import com.shop.mall.goods.service.BrandService;
import com.shop.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/brand")
public class BrandController {


    @Autowired
    private BrandService brandService;

    /***
     * 增加方法
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        brandService.save(brand);
        return RespResult.ok();
    }

    /***
     * 修改方法
     */
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /***
     * 删除方法
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") String id){
        brandService.removeById(id);
        return RespResult.ok();
    }

    /**
     * 条件查询
     */
    @PostMapping("/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    /**
     * 条件分页查询
     */
    @PostMapping("/search/{page}/{size}")
    public RespResult<List<Brand>> queryList(
            @PathVariable Long page,
            @PathVariable Long size,
            @RequestBody Brand brand){
        Page<Brand> pageInfo = brandService.queryPageList(brand,page,size);
        return RespResult.ok(pageInfo);
    }
}
