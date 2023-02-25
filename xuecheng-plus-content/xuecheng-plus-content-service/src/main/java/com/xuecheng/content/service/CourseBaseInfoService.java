package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author cmy
 * @version 1.0
 * @description 课程管理service接口
 * @date 2023/2/25 14:57
 */
public interface CourseBaseInfoService  {

    /**
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto 查询条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @author cmy
     * @date 2022/9/6 21:44
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

}
