package com.study.hello.ss.demo.test;

import com.study.hello.ss.demo.entity.Course;
import com.study.hello.ss.demo.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: fangxiangqian
 * @Date: 2023/5/28
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    public void  addCourse(){
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCname("math");
            course.setUserId(100);
            course.setCstatus("1");
            courseMapper.insert(course);
        }

    }
}
