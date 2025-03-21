package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {
    private List<Course> courses;

    public CourseList(List<Course> courses) {
        this.courses = courses;
    }

    public void changeFee(int fee) {
        for (Course course : this.courses) {

            // 주말에는 1.5배
            if(course.isSameDay(DayOfWeek.SUNDAY) || course.isSameDay(DayOfWeek.SATURDAY)) {
                course.changeFee((int) (fee * 1.5));
            }

            course.changeFee(fee);

        }
    }
}
