package com.fsantosinfo.search.studentdata.repository;

import java.util.List;

import com.fsantosinfo.search.studentdata.model.SearchStudentInterface;
import com.fsantosinfo.search.studentdata.model.StudentModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
    
    @Query(value = 
        "select st.student_name as studentName, st.lastname as studentLastname, "
        + "st.zipcode as studentZipcode, sch.official_name as schoolName, "
        + "sch.num_classes as totalClassRoom, sch.num_teachers as totalTeachers "
        + "from tab_student st inner join tab_school sch on st.school_id = sch.school_id "
        + "where sch.school_id = :schoolId", nativeQuery = true)
    List<SearchStudentInterface> searchSudentDataBySchoolId(@Param("schoolId") Integer schoolId);  
}
