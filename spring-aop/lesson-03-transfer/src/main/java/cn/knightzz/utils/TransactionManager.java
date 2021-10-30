package cn.knightzz.utils;

import java.sql.SQLException;

/**
 * @author 王天赐
 * @title: TransactionManager
 * @projectName spring-lesson-cloud
 * @description: 事务管理器类：负责手动事务的开启、提交、回滚
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:11
 */
public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    /*private TransactionManager(){

    }

    private static TransactionManager transactionManager = new TransactionManager();

    public static TransactionManager getInstance() {
        return  transactionManager;
    }*/



    // 开启手动事务控制
    public void beginTransaction() throws SQLException {
        connectionUtils.getCurrentThreadConn().setAutoCommit(false);
    }


    // 提交事务
    public void commit() throws SQLException {
        connectionUtils.getCurrentThreadConn().commit();
    }


    // 回滚事务
    public void rollback() throws SQLException {
        connectionUtils.getCurrentThreadConn().rollback();
    }
}

