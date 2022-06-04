package com.example.springboot.helper;

import com.example.springboot.dto.ReportDTO;
import com.example.springboot.entity.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportDTOtoEntityHelper {

    public Report convertToEntity(ReportDTO reportDTO){
        Report report = new Report();
        report.setReportName(reportDTO.getReportName());
        report.setReportType(reportDTO.getReportType());
        report.setEmail(reportDTO.getEmailAddress());
        report.setUsername(reportDTO.getUsername());
        return report;
    }


}
