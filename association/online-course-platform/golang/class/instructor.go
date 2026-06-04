package class

type Instructor struct {
	name       string
	courseList []*Course
}

func NewInstructor(name string) *Instructor {
	return &Instructor{
		name:       name,
		courseList: []*Course{},
	}
}

func (i *Instructor) AddCourse(course *Course) {
	i.courseList = append(i.courseList, course)
	course.UpdateInstructor(i)
	// return course
}

func (i *Instructor) GetName() string {
	return i.name
}

func (i *Instructor) GetCourses() []*Course {
	return i.courseList
}
