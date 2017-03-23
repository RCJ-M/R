package com.yudian.Do;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;

import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
public interface CurdDo {
    Boolean find(String name,String password);
    StuBasicInfo findStuBasicInfo(String id);
    List<StuCoursedyInfo> showCourseInfo();
}
