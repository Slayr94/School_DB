package School.DB.Controller;

import School.DB.Entity.Subject;
import School.DB.Service.SubjectService;
import org.hibernate.sql.ast.tree.expression.AliasedExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/addSubs")
    public Subject addSubject(@RequestBody Subject subject){
        return subjectService.addSub(subject);
    }
    @GetMapping("/allSubs")
    public List<Subject> allSubs(){
        return subjectService.allSub();
    }
    @GetMapping("/update{name}")
    public List<Subject> updateSubs(){
        return subjectService.update();
    }
}
