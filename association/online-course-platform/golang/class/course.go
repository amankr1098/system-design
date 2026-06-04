package class

type Course struct {
	title          string
	instructorInfo *Instructor
	studentList    []*Student
}

func NewCourse(title string) *Course {
	return &Course{
		title: title,
	}
}

func (c *Course) GetTitle() string {
	return c.title
}

func (c *Course) EnrollStudent(student *Student) {
	c.studentList = append(c.studentList, student)
	student.UpdateCourseInfo(c)
}

func (c *Course) UpdateInstructor(instructor *Instructor) {
	c.instructorInfo = instructor
}

func (c *Course) GetInstructorName() string {
	return c.instructorInfo.GetName()
}

func (c *Course) GetStudents() []*Student {
	return c.studentList
}
