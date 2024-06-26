package com.schedule.votation.controller;

import com.schedule.votation.entity.ScheduleEntity;
import com.schedule.votation.repository.ScheduleRepository;
import com.schedule.votation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;
    @GetMapping("/{id}")
    public Optional<ScheduleEntity> getSchedule(@PathVariable Long id) {
        return scheduleService.getSchedule(id);

    }
    @PostMapping
    public ScheduleEntity createSchedule(@RequestBody ScheduleEntity schedule){
        return scheduleService.createSchedule(schedule);
    }
    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id){
        scheduleService.deleteSchedule(id);
    }
}
//criar uma classe de user controller e vote controller
//Criar um get e post para elas
