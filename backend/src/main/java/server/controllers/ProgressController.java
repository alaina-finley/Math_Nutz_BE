package server.controllers;

import javax.validation.Valid;
import server.models.Progress;
import server.repositories.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProgressController{
    @Autowired
    ProgressRepository progressRepository;

    @GetMapping("/progresses")
    public List<Progress> getAllProgresses() {
        return progressRepository.findAll();
    }

    @PostMapping("/progresses")
    public Progress createProgress(@Valid @RequestBody Progress progress) {
        return progressRepository.save(progress);
    }

    @GetMapping(value="/progresses/{id}")
    public Progress getProgressById(@PathVariable("id") Integer id) {
        return progressRepository.findByProgressId(id);
    }

    @PutMapping(value="/progresses/{id}")
    public Progress updateProgress(@PathVariable("id") Integer id,
                                           @Valid @RequestBody Progress progress) {
        Progress progressData = progressRepository.findByProgressId(id);

        progressData.setStudent_id(progress.getStudent_id());
        progressData.setLev11_total(progress.getLev11_total());
        progressData.setLev11_correct(progress.getLev11_correct());
        progressData.setLev12_total(progress.getLev12_total());
        progressData.setLev12_correct(progress.getLev12_correct());
        progressData.setLev13_total(progress.getLev13_total());
        progressData.setLev13_correct(progress.getLev13_correct());

        progressData.setLev21_total(progress.getLev21_total());
        progressData.setLev21_correct(progress.getLev21_correct());
        progressData.setLev22_total(progress.getLev22_total());
        progressData.setLev22_correct(progress.getLev22_correct());
        progressData.setLev23_total(progress.getLev23_total());
        progressData.setLev23_correct(progress.getLev23_correct());

        progressData.setLev31_total(progress.getLev31_total());
        progressData.setLev31_correct(progress.getLev31_correct());
        progressData.setLev32_total(progress.getLev32_total());
        progressData.setLev32_correct(progress.getLev32_correct());
        progressData.setLev33_total(progress.getLev33_total());
        progressData.setLev33_correct(progress.getLev33_correct());

        progressData.setBoss_total(progress.getBoss_total());
        progressData.setBoss_correct(progress.getBoss_correct());

        Progress updatedProgress = progressRepository.save(progressData);
        return updatedProgress;
    }

    @DeleteMapping(value="/progresses/{id}")
    public Progress deleteProgress(@PathVariable("id") Integer id) {
        return progressRepository.deleteByProgressId(id);
    }
}
