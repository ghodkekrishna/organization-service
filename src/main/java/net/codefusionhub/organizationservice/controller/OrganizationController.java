package net.codefusionhub.organizationservice.controller;

import lombok.AllArgsConstructor;
import net.codefusionhub.organizationservice.dto.OrganizationDto;
import net.codefusionhub.organizationservice.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> createOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganizationDto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
    }

    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable("code") String organizationCode){
       OrganizationDto organizationDto = organizationService.getOrganization(organizationCode);
       return new ResponseEntity<>(organizationDto, HttpStatus.OK);
    }

}
