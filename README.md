# 콘솔 수강생 관리 시스템 (Console Student Management System)

![Version](https://img.shields.io/badge/버전-1.0.0-blue)
![License](https://img.shields.io/badge/라이센스-MIT-green)
![Java](https://img.shields.io/badge/Java-17-orange)

## 📝 프로젝트 개요

**콘솔 수강생 관리 시스템**은 교육 기관에서 학생 정보와 강의 등록을 효율적으로 관리할 수 있는 콘솔 기반의 애플리케이션입니다. 
사용자 친화적인 인터페이스를 통해 학생 등록, 수정, 삭제 및 강의 등록과 조회를 직관적으로 수행할 수 있습니다.

## ✨ 주요 기능

### 학생 관리
- **등록**: 신규 학생 정보 등록 (이름, 학번, 연락처, 이메일 등)
- **조회**: 전체 학생 목록 조회 및 조건별 검색 기능
- **수정**: 기존 학생 정보 업데이트
- **삭제**: 학생 정보 삭제 (논리적/물리적 삭제 지원)

### 강의 관리
- **등록**: 신규 강의 등록 (강의명, 교수, 학점, 시간 등)
- **조회**: 전체 강의 목록 및 검색 기능
- **수정**: 강의 정보 업데이트
- **삭제**: 강의 정보 삭제

### 수강 관리
- **수강신청**: 학생별 강의 등록
- **수강취소**: 등록된 강의 취소
- **수강현황**: 학생별 수강 강의 조회
- **통계**: 강의별 수강생 현황 및 통계 분석

## 🛠️ 기술 스택

- **언어**: Java 17
- **데이터 저장**: 파일 시스템 기반 (JSON/CSV)
- **아키텍처**: MVC 패턴 적용
- **테스트**: JUnit 5

## 📋 시스템 요구사항

- Java 17 이상
- 최소 512MB RAM
- 50MB 저장 공간

## 🚀 설치 및 실행 방법

### 설치

```bash
# 리포지토리 클론
git clone https://github.com/your-username/student-management-system.git

# 디렉토리 이동
cd student-management-system

# 빌드
./gradlew build
```

### 실행

```bash
java -jar build/libs/student-management-system-1.0.0.jar
```

## 💻 사용 방법

프로그램 실행 후 다음과 같은 메인 메뉴가 표시됩니다:

```
======================================================
        콘솔 수강생 관리 시스템 v1.0.0
======================================================
1. 학생 관리
2. 강의 관리
3. 수강 관리
4. 통계 보기
5. 종료
======================================================
메뉴를 선택하세요: 
```

### 학생 관리 예시

```
======================================================
              학생 관리 메뉴
======================================================
1. 학생 등록
2. 학생 목록 조회
3. 학생 정보 수정
4. 학생 정보 삭제
5. 돌아가기
======================================================
메뉴를 선택하세요: 1

-- 학생 등록 --
이름: 홍길동
학번: 20230001
연락처: 010-1234-5678
이메일: hong@example.com

학생 정보가 성공적으로 등록되었습니다!
```

## 📁 프로젝트 구조

```
student-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── sms/
│   │   │   │   │   ├── Main.java
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── StudentController.java
│   │   │   │   │   │   ├── CourseController.java
│   │   │   │   │   │   └── EnrollmentController.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── Student.java
│   │   │   │   │   │   ├── Course.java
│   │   │   │   │   │   └── Enrollment.java
│   │   │   │   │   ├── view/
│   │   │   │   │   │   ├── MainView.java
│   │   │   │   │   │   ├── StudentView.java
│   │   │   │   │   │   └── CourseView.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── StudentService.java
│   │   │   │   │   │   ├── CourseService.java
│   │   │   │   │   │   └── EnrollmentService.java
│   │   │   │   │   └── repository/
│   │   │   │   │       ├── StudentRepository.java
│   │   │   │   │       ├── CourseRepository.java
│   │   │   │   │       └── EnrollmentRepository.java
│   │   │   │   └── resources/
│   │   │   │       └── data/
│   │   │   │           ├── students.json
│   │   │   │           ├── courses.json
│   │   │   │           └── enrollments.json
│   │   │   └── test/
│   │   │       └── java/
│   │   │           └── com/
│   │   │               └── sms/
│   │   │                   ├── service/
│   │   │                   │   ├── StudentServiceTest.java
│   │   │                   │   ├── CourseServiceTest.java
│   │   │                   │   └── EnrollmentServiceTest.java
│   │   │                   └── repository/
│   │   │                       ├── StudentRepositoryTest.java
│   │   │                       ├── CourseRepositoryTest.java
│   │   │                       └── EnrollmentRepositoryTest.java
├── build.gradle
└── README.md
```

## 🏗️ 아키텍처

이 프로젝트는 **MVC(Model-View-Controller)** 패턴을 따르고 있습니다:

- **모델(Model)**: 데이터와 비즈니스 로직을 관리합니다.
- **뷰(View)**: 사용자 인터페이스를 담당합니다.
- **컨트롤러(Controller)**: 사용자 입력을 처리하고 모델과 뷰를 연결합니다.

추가로 **서비스(Service)** 레이어와 **리포지토리(Repository)** 레이어를 도입하여 관심사의 분리를 구현했습니다.

## 🔄 데이터 흐름

1. 사용자가 콘솔을 통해 명령을 입력합니다.
2. 컨트롤러가 입력을 받아 적절한 서비스로 전달합니다.
3. 서비스는 비즈니스 로직을 처리하고 필요시 리포지토리를 통해 데이터에 접근합니다.
4. 결과는 다시 컨트롤러를 거쳐 뷰를 통해 사용자에게 표시됩니다.

## 🔐 보안 기능

- 민감한 학생 정보는 암호화되어 저장됩니다.
- 로그인 시스템을 통한 접근 제어 구현
- 주요 작업에 대한 로깅 시스템 구현

## 🔄 향후 계획

- 웹 기반 인터페이스 추가
- 데이터베이스 연동 (MySQL, PostgreSQL)
- 성적 관리 기능 추가
- 다국어 지원

## 📄 라이센스

이 프로젝트는 MIT 라이센스 하에 배포됩니다. 자세한 내용은 LICENSE 파일을 참조하세요.

## 👥 기여하기

1. 이 저장소를 포크합니다.
2. 새 기능 브랜치를 생성합니다: `git checkout -b feature/amazing-feature`
3. 변경사항을 커밋합니다: `git commit -m 'Add amazing feature'`
4. 브랜치에 푸시합니다: `git push origin feature/amazing-feature`
5. Pull Request를 생성합니다.

## 📞 연락처

프로젝트 관리자: admin@student-management.com
