package server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
  @Autowired
  private StudentRepository repo;

  @RequestMapping(method = RequestMethod.GET)
  public List findStudents() {
    return repo.findAll();
  }

  @RequestMapping(method = RequestMethod.POST)
  public Student addStudent(@RequestBody Student student) {
    student.setId(null);
    return repo.saveAndFlush(student);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Student updateStudent(@RequestBody Student updatedStudent, @PathVariable Integer id) {
    updatedStudent.setId(id);
    return repo.saveAndFlush(updatedStudent);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteStudent(@PathVariable Integer id) {
    repo.delete(id);
  }
}
