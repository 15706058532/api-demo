package com.lzf.demo.demo.controller;

import com.lzf.code.annatation.LzfApiDescribe;
import com.lzf.code.annatation.LzfApiDescribe;
import com.lzf.code.annatation.LzfApiRequest;
import com.lzf.demo.demo.req.TestReq;
import com.lzf.demo.demo.req.TestUserReq;
import com.lzf.demo.demo.req.UserReq;
import com.lzf.demo.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
@LzfApiDescribe("RequestUserController  解析请求参数测试")
public class RequestUserController {
    private Logger logger = LoggerFactory.getLogger(RequestUserController.class);
    private final UserService userService;

    @Autowired
    public RequestUserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * http://localhost:8080/user/url/default/www
     */
    @LzfApiDescribe("uri参数使用默认形式")
    @GetMapping("/url/default/{id}")
    public String testFunction1(@PathVariable @LzfApiDescribe("主键Id") String id) {
        logger.debug("接收的参数{}", id);
        return id;
    }

    /**
     * http://localhost:8080/user/url/www
     */
    @LzfApiDescribe("uri参数使用指定名称")
    @GetMapping("/url/{idd}")
    public String testFunction2(@PathVariable(value = "idd") String id) {
        logger.debug("接收的参数{}", id);
        return id;
    }

    /**
     * http://localhost:8080/user/url/1/w/q
     * 参数名相同，位置不同后者覆盖前者
     */
    @LzfApiDescribe("多个uri,位置不同参数名不同参数使用指定名称")
    @GetMapping("/url/{idd}/{name}/{name}")
    public String testFunction2(@PathVariable(value = "idd") @LzfApiDescribe("主键Id") String id, @LzfApiDescribe("名称") @PathVariable(value = "name") String name) {
        logger.debug("接收的参数{}", id);
        logger.debug("接收的参数{}", name);
        return id;
    }

    /**
     * http://localhost:8080/user/form_data/string?id=qqqqqq
     */
    @LzfApiDescribe("form_data参数为string")
    @GetMapping("/form_data/string")
    public String testFunction3(String id) {
        logger.debug("接收的参数{}", id);
        return id;
    }

    /**
     * http://localhost:8080/user/form_data/string/array?ids=qqqqqq&ids=wwww
     */
    @LzfApiDescribe("form_data参数为string数组")
    @GetMapping("/form_data/string/array")
    public String testFunction4(String[] ids) {
        System.out.println(Arrays.toString(ids));
        return Arrays.toString(ids);
    }

    /**
     * http://localhost:8080/user/form_data/int/array?ids=111&ids=222
     */
    @LzfApiDescribe("form_data参数为int数组")
    @GetMapping("/form_data/int/array")
    public String testFunction5(int[] ids) {
        System.out.println(Arrays.toString(ids));
        return Arrays.toString(ids);
    }

    /**
     * 错误类型
     */
    @LzfApiDescribe("form_data参数为StringList  错误类型")
    @GetMapping("/form_data/string/list")
    public String testFunction6(List<String> ids) {
        System.out.println(ids);
        return "ok";
    }

    /**
     * http://localhost:8080/user/form_data/testUserReq?aLong=1&aBoolean=true
     */
    @LzfApiDescribe("form_data参数为TestUserReq LzfApiRequest=musts,noMusts")
    @GetMapping("/form_data/testUserReq")
    @LzfApiRequest(musts = {"aLong", "anInt", "aShort"}, noMusts = {"longs", "ings", "shorts"})
    public TestUserReq testFunction7(TestUserReq testUserReq) {
        System.out.println(testUserReq);
        return testUserReq;
    }

    @LzfApiDescribe("form_data参数为TestUserReq,TestReq")
    @GetMapping("/form_data/testUserReq/testReq")
    @LzfApiRequest(musts = {"aLong", "anInt", "aShort"}, noMusts = {"*"})
    public TestUserReq testFunction7(TestUserReq testUserReq, TestReq testReq) {
        System.out.println(testUserReq);
        System.out.println(testReq);
        return testUserReq;
    }

    /**
     * 错误类型
     */
    @LzfApiDescribe("form_data参数为TestUserReq  错误类型")
    @GetMapping("/form_data/testUserReq/array")
    public TestUserReq[] testFunction8(TestUserReq[] testUserReqs) {
        System.out.println(Arrays.toString(testUserReqs));
        return testUserReqs;
    }

    /**
     * 错误类型
     */
    @LzfApiDescribe("form_data参数为TestUserReq 错误类型")
    @GetMapping("/form_data/testUserReq/list")
    public List<TestUserReq> testFunction9(List<TestUserReq> testUserReqs) {
        System.out.println(testUserReqs);
        return testUserReqs;
    }

    /**
     * http://localhost:8080/user/json/testUserReq
     * {"aLong":1,"aShort":4}
     */
    @LzfApiDescribe("json参数为TestUserReq LzfApiRequest=noMusts")
    @GetMapping("/json/userReq")
    @LzfApiRequest(noMusts = {"id", "username", "password"})
    public UserReq testFunction10(@RequestBody UserReq userReq) {
        System.out.println(userReq);
        return userReq;
    }

    /**
     * http://localhost:8080/user/json/testUserReq/array
     * [{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":3,"aShort":4}]
     */
    @LzfApiDescribe("json参数为TestUserReq数组  @LzfApiRequest(musts = {\"aLong\", \"anInt\", \"aShort\"},noMusts = {\"*\"})")
    @GetMapping("/json/testUserReq/array")
    @LzfApiRequest(musts = {"aLong", "anInt", "aShort"},noMusts = {"*"})
    public TestUserReq[] testFunction10(@RequestBody TestUserReq[] testUserReq) {
        System.out.println(Arrays.toString(testUserReq));
        return testUserReq;
    }

    /**
     * http://localhost:8080/user/json/testUserReq/list
     * [{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":7,"aShort":4}]
     */
    @LzfApiDescribe("json参数为TestUserReqList  LzfApiRequest=musts")
    @GetMapping("/json/testUserReq/list")
    @LzfApiRequest(musts = {"aLong", "anInt", "aShort"})
    public List<TestUserReq> testFunction11(@RequestBody List<TestUserReq> testUserReqs) {
        System.out.println(testUserReqs);
        return testUserReqs;
    }

    /**
     * 复杂对象开始
     */
    /**
     * http://localhost:8080/user/json/testUserReq/array/array
     * [[{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":7,"aShort":4}],[{"aLong":1,"aShort":4},{"aLong":4,"aShort":4},{"aLong":9,"aShort":4}]]
     */
    @LzfApiDescribe("json参数为TestUserReq数组数组   LzfApiRequest()")
    @GetMapping("/json/testUserReq/array/array")
    @LzfApiRequest()
    public TestUserReq[][] testFunction12(@RequestBody TestUserReq[][] testUserReq) {
        System.out.println(Arrays.toString(testUserReq));
        return testUserReq;
    }

    /**
     * http://localhost:8080/user/json/testUserReq/list/list
     * [[{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":7,"aShort":4}],[{"aLong":1,"aShort":4},{"aLong":4,"aShort":4},{"aLong":9,"aShort":4}]]
     */
    @LzfApiDescribe("json参数为TestUserReqListList @LzfApiRequest(musts = {\"*\"})")
    @GetMapping("/json/testUserReq/list/list")
    @LzfApiRequest(musts = {"*"})
    public List<List<TestUserReq>> testFunction12(@RequestBody List<List<TestUserReq>> testUserReqs) {
        System.out.println(testUserReqs);
        return testUserReqs;
    }

    /**
     * http://localhost:8080/user/json/testUserReq/collection/list/list
     * [[[{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":7,"aShort":4}],[{"aLong":1,"aShort":4},{"aLong":4,"aShort":4},{"aLong":9,"aShort":4}]],[[{"aLong":1,"aShort":4},{"aLong":2,"aShort":4},{"aLong":7,"aShort":4}],[{"aLong":1,"aShort":4},{"aLong":4,"aShort":4},{"aLong":9,"aShort":4}]]]
     */
    @LzfApiDescribe("json参数为TestUserReqCollectionListList   @LzfApiRequest(noMusts = {\"*\"})")
    @GetMapping("/json/testUserReq/collection/list/list")
    @LzfApiRequest(noMusts = {"*"})
    public Collection<List<List<TestUserReq>>> testFunction12(@RequestBody Collection<List<List<TestUserReq>>> testUserReqs) {
        System.out.println(testUserReqs);
        return testUserReqs;
    }

    /**
     * http://localhost:8080/user/many/20/www/testUserReq/testReq/testUserReq?aFloat=1.111&password=dddddd
     * {"aLong":4,"aShort":4}
     */
    @LzfApiDescribe("三种形式形式的参数为多种形式参数@LzfApiRequest(musts={\"*\"},noMusts={\"*\"})")
    @GetMapping("/many/{id}/{name}/tUReq/tReq/tUReq")
    @LzfApiRequest(musts = {"*"}, noMusts = {"*"})
    public TestUserReq testFunction13(@PathVariable(value = "id") Integer id, @PathVariable(value = "name") String name, TestUserReq userReq, TestReq testReq, @RequestBody TestUserReq testUserReq) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(userReq);
        System.out.println(testReq);
        return testUserReq;
    }

    /**
     * http://localhost:8080/user/json/testUserReq
     * {"aLong":1,"aShort":4}
     */
    @LzfApiDescribe("json参数为TestUserReq @LzfApiRequest(musts ={\"*\"},noMusts ={\"id\", \"username\", \"password\"})")
    @GetMapping("/json/userReq2")
    @LzfApiRequest(musts = {"*"}, noMusts = {"id", "username", "password"})
    public UserReq testFunction14(@RequestBody UserReq userReq) {
        System.out.println(userReq);
        return userReq;
    }
}
