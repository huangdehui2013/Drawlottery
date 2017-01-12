package com.hudongwx.drawlottery.mobile.web.user;

import com.alibaba.fastjson.JSONObject;
import com.hudongwx.drawlottery.mobile.TestBaseWeb;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author wu
 * @version 1.0, 2017/1/12 <br/>
 * @desc <p>
 * <p>
 * 创建　wu　2017/1/12 <br/>
 * <p>
 * 用户收货地址
 * <p>
 * @email 294786949@qq.com
 */
public class CommodityExchangeControllerTest extends TestBaseWeb {
    @Test
    public void testQueryCommExchangeWays() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("commId", 1L);
        post("/api/v1/user/commodity/commexchways", jsonObject.toJSONString());
    }

    @Test
    public void testExchangeToCash() throws Exception {

    }

    @Test
    public void testExchangeToGold() throws Exception {
    }

    @Test
    public void testExchangeToRechargeCard() throws Exception {

    }

    @Test
    public void testQueryExchangeToRechargeCard() throws Exception {

    }

    @Test
    public void testQueryExchangeToRechargeCardInfo() throws Exception {

    }

    @Test
    public void testExchangeToExpress() throws Exception {

    }

    @Test
    public void testExchangeToLocale() throws Exception {

    }

    @Resource
    CommodityExchangeController exchangeController;

    @Override
    public Object getController() {
        return exchangeController;
    }
}