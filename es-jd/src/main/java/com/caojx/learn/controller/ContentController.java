package com.caojx.learn.controller;

import com.caojx.learn.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author caojx created on 2022/6/19 11:16 PM
 */
@Controller
public class ContentController {
    @Autowired
    private ContentService contentService;

    @ResponseBody
    @GetMapping("/parse/{keyword}")
    public Boolean parse(@PathVariable("keyword") String keyword) throws IOException {
        return contentService.parseContent(keyword);
    }

//    @ResponseBody
//    @GetMapping("/search/{keyword}/{pageIndex}/{pageSize}")
//    public List<Map<String, Object>> parse(@PathVariable("keyword") String keyword,
//                                           @PathVariable("pageIndex") Integer pageIndex,
//                                           @PathVariable("pageSize") Integer pageSize) throws IOException {
//        return contentService.search(keyword, pageIndex, pageSize);
//    }


    @ResponseBody
    @GetMapping("/search/{keyword}/{pageNo}/{pageSize}")
    public List<Map<String, Object>> pageSearch(@PathVariable("keyword") String keyword,
                                                @PathVariable("pageNo") int pageNo,
                                                @PathVariable("pageSize") int pageSize) throws Exception {
        return contentService.highlightSearch(keyword, pageNo, pageSize);
    }
}
