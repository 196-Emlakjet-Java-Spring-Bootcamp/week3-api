package com.example.springboot.service;

import com.example.springboot.dao.ReportRepository;
import com.example.springboot.dto.ReportDTO;
import com.example.springboot.helper.ReportDTOtoEntityHelper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ReportConsumer {

    private ReportRepository reportRepository;

    private ReportDTOtoEntityHelper helper;

    @Autowired
    public ReportConsumer(ReportRepository reportRepository, ReportDTOtoEntityHelper helper){
        this.reportRepository = reportRepository;
        this.helper = helper;
    }

    @RabbitListener(queues = {"${report-queue.name}"})
    public void receive(@Payload ReportDTO reportDTO) throws InterruptedException {
        Thread.sleep(2 * 1000); //
        reportRepository.save(helper.convertToEntity(reportDTO));

        System.out.println("Message " + reportDTO);
    }
}
