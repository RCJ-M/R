package com.yudian.model;

import javax.persistence.*;

/**
 * Created by yudian-it on 2017/3/29.
 */
@Entity
@Table(name = "teacher_timetable")
public class TeacherTimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;//主键
    private String teacherId;//教师id
    private String courseId;//课程Id
    private String courseName;//课程名称
    private String classLocation;//上课地点
    private String classTime;//上课时间

    public TeacherTimeTable() {
    }

    public TeacherTimeTable(String classLocation, String classTime, String courseId, String courseName, String teacherId) {
        this.classLocation = classLocation;
        this.classTime = classTime;
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacherId = teacherId;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
