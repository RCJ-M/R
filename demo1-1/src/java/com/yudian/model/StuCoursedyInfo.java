package com.yudian.model;

import javax.persistence.*;

/**
 * Created by yudian-it on 2017/3/22.
 */
@Entity
@Table(name = "stu_course_info")
public class StuCoursedyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;//序号，生成主键用
    private String stuId;//学生id
    private String courseId;//课程id

    private String courseName;//课程名称
    private String courseScore;//课程成绩
    private String courseGradePoint;//课程绩点

    public StuCoursedyInfo(String courseGradePoint, String courseId, String courseName, String courseScore, String stuId) {
        this.courseGradePoint = courseGradePoint;
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseScore = courseScore;
        this.stuId = stuId;
    }

    public StuCoursedyInfo() {
    }

    public String getCourseGradePoint() {
        return courseGradePoint;
    }

    public void setCourseGradePoint(String courseGradePoint) {
        this.courseGradePoint = courseGradePoint;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(String courseScore) {
        this.courseScore = courseScore;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
