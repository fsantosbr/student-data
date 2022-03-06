package com.fsantosinfo.search.studentdata.controller;

import java.util.List;

import com.fsantosinfo.search.studentdata.dto.SearchStudentResponseDTO;
import com.fsantosinfo.search.studentdata.service.impl.SearchStudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/searchers")
public class SearchStudentController {
    
    @Autowired
    private SearchStudentServiceImpl searchService;   

    @GetMapping()
    public ResponseEntity<List<SearchStudentResponseDTO>> findStudentDataBySchoolId(
                            @RequestParam(name = "schoolId", required = true) Integer schoolId) {
        return ResponseEntity.ok().body(this.searchService.searchStudentBySchoolId(schoolId));
                        }    
}
