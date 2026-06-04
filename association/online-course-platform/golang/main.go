package main

import (
	"fmt"
	"online-course/class"
)

func main() {
	alice := class.NewInstructor("Alice")
	dsa := class.NewCourse("Data Structures")
	sysDesign := class.NewCourse("System Design")

	alice.AddCourse(dsa)
	alice.AddCourse(sysDesign)

	bob := class.NewStudent("Bob")
	charlie := class.NewStudent("Charlie")

	dsa.EnrollStudent(bob)
	dsa.EnrollStudent(charlie)
	sysDesign.EnrollStudent(charlie)

	fmt.Println(alice.GetName() + "'s courses:")
	for _, c := range alice.GetCourses() {
		fmt.Println("  - " + c.GetTitle())
	}

	fmt.Println("Students in " + dsa.GetTitle() + ":")
	for _, s := range dsa.GetStudents() {
		fmt.Println("  - " + s.GetName())
	}

	fmt.Println(bob.GetName() + "'s instructor: " + bob.GetInstructorName())
}
