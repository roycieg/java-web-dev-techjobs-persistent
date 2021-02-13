package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;

import java.util.Optional;

public interface EmployerRepository {
    Object findAll();

    Optional<Employer> findById(int employerId);
}
