package com.boot.fullprojectspringreact.student;

import java.time.LocalDate;
import java.util.UUID;

public class StudentCourse {

    private final UUID studentId;
    private final UUID courseId;
    private final String name;
    private final String descrtiption;
    private final String department;
    private final String teacherName;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Integer grade;

    public StudentCourse(UUID studentId,
                         UUID courseId,
                         String name,
                         String descrtiption,
                         String department,
                         String teacherName,
                         LocalDate startDate,
                         LocalDate endDate,
                         Integer grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.name = name;
        this.descrtiption = descrtiption;
        this.department = department;
        this.teacherName = teacherName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.grade = grade;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return descrtiption;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Integer getGrade() {
        return grade;
    }
}
