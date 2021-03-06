package com.game.clas.web;

import com.game.clas.DAO.ConnectStudent;
import com.game.clas.DAO.CreateNewClazz;
import com.game.clas.DAO.CreateNewCondition;
import com.game.clas.DAO.CreateNewTask;
import com.game.clas.service.ClasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@CrossOrigin("*")
public class ClasController {

    @Autowired
    private ClasService teacherService;

    //  create class
    @PostMapping("/class/create/class")
    public ResponseEntity<?> createClass(@Valid @RequestBody CreateNewClazz createNewClazz) {
        log.info("/class/create/class with posted " + createNewClazz + " run");
        return ResponseEntity.ok(teacherService.createClazz(createNewClazz));
    }

    //  create task in input class and input data
    @PostMapping("/class/create/task")
    public ResponseEntity<?> createTask(@Valid @RequestBody CreateNewTask createNewTask) {
        log.info("/class/create/task with posted " + createNewTask + " run");
        return ResponseEntity.ok(teacherService.createTask(createNewTask));
    }

    //  create conditions for input task
    @PostMapping("/class/create/condition")
    public ResponseEntity<?> createTask(@Valid @RequestBody CreateNewCondition createNewCondition) {
        log.info("/class/create/condition with posted " + createNewCondition + " run");
        return ResponseEntity.ok(teacherService.createCondition(createNewCondition));
    }

    //  get all classes for teacher
    @GetMapping("/class/clazz/{owner}")
    public ResponseEntity<?> getAllClasses(@Valid @PathVariable String owner) {
        log.info("/class/create/{" + owner + "} run");
        return ResponseEntity.ok(teacherService.getAllClazzes(owner));
    }

    //  get all tasks for class
    @GetMapping("/class/task/{classId}")
    public ResponseEntity<?> getAllTasks(@Valid @PathVariable String classId) {
        log.info("/class/create/{" + classId + "} run");
        return ResponseEntity.ok(teacherService.getAllClazzesTask(classId));
    }

    //  get all conditions for task
    @GetMapping("/class/condition/{taskId}")
    public ResponseEntity<?> getAllConditions(@Valid @PathVariable String taskId) {
        log.info("/class/create/{" + taskId + "} run");
        return ResponseEntity.ok(teacherService.getAllTasksConditions(taskId));
    }

    //  get all students by teacher
    @GetMapping("/class/students-teacher/{teacher}")
    public ResponseEntity<?> getAllStudentsByTeacher(@Valid @PathVariable String teacher) {
        log.info("/class/students-teacher/{" + teacher + "} run");
        return ResponseEntity.ok(teacherService.getAllStudent(teacher));
    }

    //  get all classes for student name
    @GetMapping("/class/classes-student/{student}")
    public ResponseEntity<?> getAllClassesByStudent(@Valid @PathVariable String student) {
        log.info("/class/classes-student/{" + student + "} run");
        return ResponseEntity.ok(teacherService.getAllClassFromStudent(student));
    }

    // get all students by class name
    @GetMapping("/class/student-classes/{clazz}")
    public ResponseEntity<?> getAllStudentByClass(@Valid @PathVariable String clazz) {
        log.info("/class/student-classes/{" + clazz + "} run");
        return ResponseEntity.ok(teacherService.getAllStudentFromClass(clazz));
    }

    //  connect Student to Class by code
    @PostMapping("/class/connect")
    public ResponseEntity<?> getAllStudentByClass(@Valid @RequestBody ConnectStudent connectStudent) {
        log.info("run /class/connect/" + connectStudent);
        return ResponseEntity.ok(teacherService.connectStudentToClass(connectStudent));
    }
}
