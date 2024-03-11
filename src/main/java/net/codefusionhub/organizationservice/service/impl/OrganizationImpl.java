package net.codefusionhub.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import net.codefusionhub.organizationservice.dto.OrganizationDto;
import net.codefusionhub.organizationservice.entity.Organization;
import net.codefusionhub.organizationservice.mapper.OrganizationMapper;
import net.codefusionhub.organizationservice.repository.OrganizationRepository;
import net.codefusionhub.organizationservice.service.OrganizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizationImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization saveOrganization = organizationRepository.save(organization);
        return OrganizationMapper.mapToOrganizationDto(saveOrganization);
    }

    @Override
    public OrganizationDto getOrganization(String organizationCode) {
       Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
