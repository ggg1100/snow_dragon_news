/**
 * 
 */
package com.example.demo.algorithm.ztl.contentbasedrecommend;

import org.ansj.app.keyword.KeyWordComputer;
import org.ansj.app.keyword.Keyword;
import org.ansj.domain.Result;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.List;

public class TFIDF
{
	public static Result split(String text)
	{
		return ToAnalysis.parse(text);
	}

	/**
	 * 
	 * @param title 文本标题
	 * @param content 文本内容
	 * @param keyNums 返回的关键词数目
	 * @return
	 */
	public static List<Keyword> getTFIDE(String title, String content,int keyNums)
	{
		KeyWordComputer kwc = new KeyWordComputer(keyNums);
		return kwc.computeArticleTfidf(title, content);
	}
	
	/**
	 * 
	 * @param content 文本内容
	 * @param keyNums 返回的关键词数目
	 * @return
	 */
	public static List<Keyword> getTFIDE(String content,int keyNums)
	{
		KeyWordComputer kwc = new KeyWordComputer(keyNums);
		return kwc.computeArticleTfidf(content);
	}

	/*public static void main(String[] args) {
		String sentence="我今天很开心，所以一口气买了好多东西。然而我一不小心把本月预算透支了，现在有很不开心了，因为后面的日子得吃土了！";
		System.out.println(TFIDF.getTFIDE("hh", sentence, 10));
	}*/
}
