package com.fi.ls.rest.assembler;

import com.iqmsoft.mm.dto.lecturer.LecturerDTO;
import com.iqmsoft.mm.rest.controller.LecturersController;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;


@Component
public class LecturerResourceAssembler implements ResourceAssembler<LecturerDTO, Resource<LecturerDTO>> {

    @Override
    public Resource<LecturerDTO> toResource(LecturerDTO lecturerDTO) {
        Resource<LecturerDTO> lecturerResource = new Resource<>(lecturerDTO);

        try {
            lecturerResource.add(linkTo(LecturersController.class).slash(lecturerDTO.getId()).withSelfRel());
            lecturerResource.add(linkTo(LecturersController.class).slash(lecturerDTO.getId()).slash("languages").withRel("languages"));
            lecturerResource.add(linkTo(LecturersController.class).slash(lecturerDTO.getId()).slash("lectures").withRel("lectures"));
            lecturerResource.add(linkTo(LecturersController.class).slash(lecturerDTO.getId()).withRel("DELETE"));
            lecturerResource.add(linkTo(LecturersController.class).slash("update").withRel("PUT"));

        } catch (Exception ex) {
            Logger.getLogger(LecturerResourceAssembler.class.getName()).log(Level.SEVERE, "could not link resource from LecturersController", ex);
        }

        return lecturerResource;
    }
}
