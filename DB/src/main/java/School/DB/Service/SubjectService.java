package School.DB.Service;

import School.DB.Entity.Subject;
import School.DB.Entity.Teacher;
import School.DB.Repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepo subjectRepo;

    public Subject addSub(Subject subject){
        return subjectRepo.save(subject);
    }
    public List<Subject> allSub(){
        return subjectRepo.findAll();
    }
    public List<Subject> update() {
        Subject subject = new Subject();
        subject.setSubject("English");
        Teacher teacher = new Teacher();
        return subjectRepo.findAll();
    }
}
