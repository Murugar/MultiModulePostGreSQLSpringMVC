package com.iqmsoft.mm.dto.student;

import java.util.ArrayList;
import java.util.List;

import com.iqmsoft.mm.dto.lecture.LectureDTO;
import com.iqmsoft.mm.dto.user.LSUserDTO;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;


public class StudentDTO extends LSUserDTO {
    
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String birthNumber;
    private List<LectureDTO> listOfLectures = new ArrayList<>();

    public StudentDTO() {
    }
    
    public void addLecture(LectureDTO l) {
        this.listOfLectures.add(l);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthNumber() {
        return birthNumber;
    }

    public List<LectureDTO> getListOfLectures() {
        return listOfLectures;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    public void setListOfLectures(List<LectureDTO> listOfLectures) {
        this.listOfLectures = listOfLectures;
    }
    
}
