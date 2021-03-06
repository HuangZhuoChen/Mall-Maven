package com.mavenTest.mall.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mavenTest.mall.common.response.ServerResponse;
import com.mavenTest.mall.core.service.ICategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping("/selectTopCategory")
	@ResponseBody
	public ServerResponse selectTopCategory() {
		return categoryService.selectTopCategory();
	}
	
	@RequestMapping("/selectSecondCategory")
	@ResponseBody
	public ServerResponse selectSecondCategory(Integer topCategoryId) {
		return categoryService.selectSecondCategory(topCategoryId);
	}
	
	@RequestMapping("/getCategoryCountAnalysisPage")
	public String getCategoryCountAnalysisPage() {
		return "category_count_analysis";
	}
	
	@RequestMapping("/getCategoryCountAnalysis")
	@ResponseBody
	public ServerResponse getCategoryCountAnalysis() {
		return categoryService.getCategoryCountAnalysis();
	}
}
