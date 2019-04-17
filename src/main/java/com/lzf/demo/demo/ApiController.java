package com.lzf.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 写点注释
 * <br/>
 * Created in 2019-03-16 22:54
 *
 * @author Li Zhenfeng
 */
@RestController
public class ApiController {
    @GetMapping("/aaa")
    public String apiIndex(){
        return "aaa";
    }
}
