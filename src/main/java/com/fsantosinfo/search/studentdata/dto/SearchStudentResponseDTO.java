package com.fsantosinfo.search.studentdata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class SearchStudentResponseDTO {
    
    private String studentName;
    private String studentLastname;
    private String studentZipcode;
    private String schoolName;
    private Integer totalClassRoom;
    private Integer totalTeachers;   
}
