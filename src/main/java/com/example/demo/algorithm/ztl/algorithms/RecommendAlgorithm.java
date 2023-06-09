/**
 * 
 */
package com.example.demo.algorithm.ztl.algorithms;

import java.util.List;

public interface RecommendAlgorithm
{
	/**
	 * 推荐算法的int表示
	 */
	//协同过滤     
	public static final int CF=0;
	//基于内容的推荐
	public static final int CB=1;
	//基于热点新闻的推荐
	public static final int HR=2;
	/**
	 * 针对所有用户返回推荐结果
	 */
	public default void recommend(){
		recommend(RecommendKit.getUserList());
	}
	
	/**
	 * 针对特定用户返回推荐结果
	 */
	public void recommend(List<Long> users);
}

