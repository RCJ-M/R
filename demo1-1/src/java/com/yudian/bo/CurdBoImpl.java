package com.yudian.bo;

import com.yudian.model.StuBasicInfo;
import com.yudian.model.StuCoursedyInfo;
import org.springframework.stereotype.Service;
import com.yudian.Do.CurdDo;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yudian-it on 2017/3/20.
 */
@Service("curdBo")
@Transactional
public class CurdBoImpl implements CurdBo {


   @Resource(name = "curdDo")
   CurdDo curdDo;
    @Override
    public Boolean find(String name,String password) {
        return curdDo.find( name,password);
    }

    @Override
    public StuBasicInfo findStuBasicInfo(String id) {
        return curdDo.findStuBasicInfo(id);
    }
    public List<StuCoursedyInfo> showCourseInfo(String id){
        return curdDo.showCourseInfo(id);
    }
}
