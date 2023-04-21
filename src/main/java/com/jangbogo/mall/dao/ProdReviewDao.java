package com.jangbogo.mall.dao;

import com.jangbogo.mall.domain.ProdReviewDto;

import java.util.List;

public interface ProdReviewDao {
    List<ProdReviewDto> selectAll(Integer prod_idx) throws Exception;
    Integer update(ProdReviewDto prodReviewDto) throws Exception;
}
