package cn.knightzz.dao;

import cn.knightzz.pojo.Account;

/**
 * @author 王天赐
 * @title: AccountDao
 * @projectName spring-lesson-cloud
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:09
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
