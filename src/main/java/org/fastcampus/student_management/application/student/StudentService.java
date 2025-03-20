package org.fastcampus.student_management.application.student;

import org.fastcampus.student_management.application.student.dto.StudentInfoDto;
import org.fastcampus.student_management.domain.Student;
import org.fastcampus.student_management.repo.StudentRepository;

public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public void saveStudent(StudentInfoDto studentInfoDto) {
    Student student = new Student(studentInfoDto.getName(), studentInfoDto.getAge(), studentInfoDto.getAddress());
    studentRepository.save(student);
  }

  public Student getStudent(String name) {
    return studentRepository.findByName(name)
        .orElseThrow(() -> new IllegalArgumentException("해당하는 학생이 없습니다."));
  }

  public boolean activateStudent(String name) {
    try {
      return this.getStudent(name).isActivate();
    } catch (IllegalArgumentException e) {
      // 예외 로깅 또는 다른 처리
      return false; // 또는 예외를 다시 던지거나 다른 적절한 처리
    }
  }

  public void deactivateStudent(String name) {
    // TODO: 과제 구현 부분
  }
}
