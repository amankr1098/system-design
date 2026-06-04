package class

type Student struct {
	name       string
	courseInfo *Course
}

func NewStudent(name string) *Student {
	return &Student{
		name: name,
	}
}

func (s *Student) GetName() string {
	return s.name
}

func (s *Student) UpdateCourseInfo(course *Course) {
	s.courseInfo = course
}

func (s *Student) GetInstructorName() string {
	if s.courseInfo == nil {
		return "No instructor"
	}
	return s.courseInfo.GetInstructorName()
}

func (s *Student) GetEnrolledCourse() *Course {
	return s.courseInfo
}
