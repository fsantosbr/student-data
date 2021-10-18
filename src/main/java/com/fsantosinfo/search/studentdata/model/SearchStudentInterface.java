package com.fsantosinfo.search.studentdata.model;

import com.fsantosinfo.search.studentdata.dto.SearchStudentResponseDTO;

public interface SearchStudentInterface {

    String getStudentName();
    String getStudentLastname();
    String getStudentZipcode();
    String getSchoolName();
    Integer getTotalClassRoom();
    Integer getTotalTeachers();

    default SearchStudentResponseDTO toDto(){
        return SearchStudentResponseDTO.builder()
            .studentName(getStudentName())
            .studentLastname(getStudentLastname())
            .studentZipcode(getStudentZipcode())
            .schoolName(getSchoolName())
            .totalClassRoom(getTotalClassRoom())
            .totalTeachers(getTotalTeachers()).build();
    }
        
}
