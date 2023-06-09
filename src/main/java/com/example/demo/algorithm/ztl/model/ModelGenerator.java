/**
 * 
 */
package com.example.demo.algorithm.ztl.model;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.example.demo.algorithm.ztl.dbconnection.DBKit;


public class ModelGenerator
{

	public static void main(String[] args)
	{
		// base model 所使用的包名
		String baseModelPackageName = "com.example.demo.top.ztl.model.base";
		// base model 文件保存路径
		String baseModelOutputDir = PathKit.getRootClassPath() + "/../../src/com.example.demo.top/ztl/model/base";
		System.out.println("rootclasspath:"+baseModelOutputDir);
		// model 所使用的包名 (MappingKit 默认使用的包名)
		String modelPackageName = "com.example.demo.top.ztl.model";
		// model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
		String modelOutputDir = baseModelOutputDir+"/..";
		System.out.println(baseModelOutputDir);
		// 创建生成器
		Generator gernerator = new Generator(DBKit.getDataSource(), baseModelPackageName, baseModelOutputDir,
				modelPackageName, modelOutputDir);
		gernerator.setDialect(new MysqlDialect());
		// 设置是否在 Model 中生成 dao 对象
		gernerator.setGenerateDaoInModel(true);
		// 设置是否生成字典文件
		gernerator.setGenerateDataDictionary(false);
		// 生成
		gernerator.generate();
	}
}
