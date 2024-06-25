package com.schedule.votation.service;

import com.schedule.votation.entity.ScheduleEntity;
import com.schedule.votation.repository.ScheduleRepository;
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
    public Optional<ScheduleEntity> getSchedule(Long id){
        return scheduleRepository.findById(id);
    }
}
