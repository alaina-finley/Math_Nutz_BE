package server.controllers;

import javax.validation.Valid;
import server.models.Problem;
import server.repositories.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProblemController{
    @Autowired
    ProblemRepository problemRepository;

    @GetMapping("/problems")
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    @PostMapping("/problems")
    public Problem createProblem(@Valid @RequestBody Problem problem) {
        return problemRepository.save(problem);
    }

    // @GetMapping(value="/problems/{id}")
    // public ResponseEntity<Problem> getProblemById(@PathVariable Integer id) {
    //     return problemRepository.findByProblemId(id)
    //             .map(problem -> ResponseEntity.ok().body(problem))
    //             .orElse(ResponseEntity.notFound().build());
    // }
    @GetMapping(value="/problems/{id}")
    public Problem getProblemById(@PathVariable("id") Integer id) {
        return problemRepository.findByProblemId(id);
    }

    // @PutMapping(value="/problems/{id}")
    // public ResponseEntity<Problem> updateProblem(@PathVariable Integer id,
    //                                        @Valid @RequestBody Problem problem) {
    //     return problemRepository.findByProblemId(id)
    //             .map(problemData -> {
    //                 problemData.setFirst(problem.getFirst());
    //                 problemData.setSecond(problem.getSecond());
    //                 problemData.setOperation(problem.getOperation());
    //                 problemData.setDifficulty(problem.getDifficulty());
    //                 Problem updatedProblem = problemRepository.save(problemData);
    //                 return ResponseEntity.ok().body(updatedProblem);
    //             }).orElse(ResponseEntity.notFound().build());
    // }
    @PutMapping(value="/problems/{id}")
    public Problem updateProblem(@PathVariable("id") Integer id,
                                           @Valid @RequestBody Problem problem) {
        Problem problemData = problemRepository.findByProblemId(id);
        problemData.setFirst(problem.getFirst());
        problemData.setSecond(problem.getSecond());
        problemData.setOperation(problem.getOperation());
        problemData.setDifficulty(problem.getDifficulty());
        Problem updatedProblem = problemRepository.save(problemData);
        return updatedProblem;
    }

    // @DeleteMapping(value="/problems/{id}")
    // public ResponseEntity<?> deleteProblem(@PathVariable Integer id) {
    //     return problemRepository.findByProblemId(id)
    //             .map(problem -> {
    //                 problemRepository.deleteById(id);
    //                 return ResponseEntity.ok().build();
    //             }).orElse(ResponseEntity.notFound().build());
    // }
    @DeleteMapping(value="/problems/{id}")
    public Problem deleteProblem(@PathVariable("id") Integer id) {
        return problemRepository.deleteByProblemId(id);
    }
}
