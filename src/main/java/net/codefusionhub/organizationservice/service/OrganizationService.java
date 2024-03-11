package net.codefusionhub.organizationservice.service;

import net.codefusionhub.organizationservice.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto getOrganization(String organizationCode);
}
