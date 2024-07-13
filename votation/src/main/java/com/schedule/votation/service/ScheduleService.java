package com.schedule.votation.service;

import com.schedule.votation.entity.ScheduleEntity;
import com.schedule.votation.repository.ScheduleRepository;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public ScheduleEntity createSchedule(ScheduleEntity schedule){
        return scheduleRepository.save(schedule);
    }
    public ScheduleEntity getSchedule(Long id){
        var schedule=scheduleRepository.findById(id);
        if (schedule.isEmpty()){
            throw new RuntimeException("Pauta não encontrada");
        }else {
            return schedule.get();
        }

    }
    public void deleteSchedule(Long id) {
        var schedule = scheduleRepository.findById(id);
        if (schedule.isEmpty()) {
            throw new RuntimeException("Pauta não encontrada");
        } else {
            scheduleRepository.deleteById(id);
        }
    }
}