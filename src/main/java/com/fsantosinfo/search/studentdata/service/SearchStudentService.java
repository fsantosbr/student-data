package com.fsantosinfo.search.studentdata.service;

import java.util.List;

import com.fsantosinfo.search.studentdata.dto.SearchStudentResponseDTO;

public interface SearchStudentService {

    public List<SearchStudentResponseDTO> searchStudentBySchool(Integer schoolId);
}
