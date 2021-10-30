package cn.knightzz.utils;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author 王天赐
 * @title: DruidUtils
 * @projectName spring-lesson-cloud
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:11
 */
public class DruidUtils {

    private DruidUtils(){
    }

    private static DruidDataSource druidDataSource = new DruidDataSource();


    // 类加载的时候就自动设置
    static {
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/lg_camp");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

    }

    public static DruidDataSource getInstance() {
        return druidDataSource;
    }

}

