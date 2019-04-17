package com.lzf.demo.demo.controller;

import com.lzf.code.annatation.ClassType;
import com.lzf.code.annatation.LzfApiDescribe;
import com.lzf.code.annatation.LzfApiDescribe;
import com.lzf.code.annatation.LzfApiResponse;
import com.lzf.demo.demo.common.DemoPage;
import com.lzf.demo.demo.common.DemoResult;
import com.lzf.demo.demo.resp.TestUserResp;
import com.lzf.demo.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 写点注释
 * <br/>
 * Created in 2019-03-17 16:04:02
 * <br/>
 *
 * @author Li Zhenrfeng
 */
@RestController
@RequestMapping("/user")
@LzfApiDescribe("JsonResponseUserController  解析json返回形式测试")
public class JsonResponseUserController {
    private Logger logger = LoggerFactory.getLogger(JsonResponseUserController.class);
    private final UserService userService;

    @Autowired
    public JsonResponseUserController(UserService userService) {
        this.userService = userService;
    }

    @LzfApiDescribe("返回json对象")
    @GetMapping("/json")
    public TestUserResp testFunction1() {
        return new TestUserResp();
    }

    @LzfApiDescribe("返回json数组")
    @GetMapping("/json/array")
    public TestUserResp[] testFunction2() {
        return new TestUserResp[1];
    }

    @LzfApiDescribe("返回jsonList")
    @GetMapping("/json/list")
    public List<TestUserResp> testFunction3() {
        return new ArrayList<>();
    }

    @LzfApiDescribe("返回jsonListArray")
    @GetMapping("/json/list/array")
    public List<TestUserResp[]> testFunction4() {
        return new ArrayList<>();
    }

    @LzfApiDescribe("返回jsonLisSetCollection")
    @GetMapping("/json/list/set/collection")
    public List<Set<Collection<TestUserResp>>> testFunction5() {
        return new ArrayList<>();
    }

    @LzfApiDescribe("返回demoResult 无分页")
    @GetMapping("/demoResult")
    @LzfApiResponse(name = "data", clazz = TestUserResp.class)
    public DemoResult testFunction6() {
        DemoResult demoResult = new DemoResult();
        demoResult.setCode(0);
        demoResult.setMsg("OK");
        demoResult.setData(new TestUserResp());
        return demoResult;
    }

    @LzfApiDescribe("返回demoResult 有分页")
    @GetMapping("/demoResult/page")
    @LzfApiResponse(name = "data", clazz = DemoPage.class, pageName = "data", pageClazz = TestUserResp.class, pageClazzType = ClassType.List)
    public DemoResult testFunction7() {
        DemoResult demoResult = new DemoResult();
        demoResult.setCode(0);
        demoResult.setMsg("OK");
        DemoPage<TestUserResp> demoPage = new DemoPage<>();
        List<TestUserResp> testUserResps = new ArrayList<>();
        TestUserResp testUserResp = new TestUserResp();
        testUserResps.add(testUserResp);
        demoPage.setData(testUserResps);
        demoResult.setData(demoPage);
        return demoResult;
    }

    @LzfApiDescribe("返回分页")
    @GetMapping("/page")
    @LzfApiResponse(name = "data", clazz = TestUserResp.class)
    public DemoPage testFunction8() {
        DemoPage<TestUserResp> demoPage = new DemoPage<>();
        List<TestUserResp> testUserResps = new ArrayList<>();
        TestUserResp testUserResp = new TestUserResp();
        testUserResps.add(testUserResp);
        demoPage.setData(testUserResps);
        return demoPage;
    }

}
