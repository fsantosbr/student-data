package com.fsantosinfo.search.studentdata.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.fsantosinfo.search.studentdata.dto.SearchStudentResponseDTO;
import com.fsantosinfo.search.studentdata.model.SearchStudentInterface;
import com.fsantosinfo.search.studentdata.repository.StudentRepository;
import com.fsantosinfo.search.studentdata.service.SearchStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchStudentServiceImpl implements SearchStudentService{

    @Autowired
    private StudentRepository studentRepository;    

    @Override
    public List<SearchStudentResponseDTO> searchStudentBySchool(Integer schoolId) {
        List<SearchStudentInterface> studentResultList = this.studentRepository.searchSudentDataBySchoolId(schoolId);
        
        return studentResultList.stream().map((x) -> x.toDto()).collect(Collectors.toList());
    }
    
}
