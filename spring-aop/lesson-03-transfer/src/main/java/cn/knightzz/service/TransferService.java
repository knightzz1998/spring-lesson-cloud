package cn.knightzz.service;

/**
 * @author 王天赐
 * @title: TransferService
 * @projectName spring-lesson-cloud
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/10/30 15:41
 */
public interface TransferService {
    void transfer(String fromCardNo,String toCardNo,int money) throws Exception;
}

