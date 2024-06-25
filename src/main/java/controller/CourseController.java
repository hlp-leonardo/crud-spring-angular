package controller;

import lombok.AllArgsConstructor;
import model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CourseRepository;

import java.util.List;

@RequestMapping("/api/courses")
@RestController
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;
    /*
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    */

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
