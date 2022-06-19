package com.caojx.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author caojx created on 2022/6/19 11:19 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    private String name;
    private String img;
    private String price;
}
