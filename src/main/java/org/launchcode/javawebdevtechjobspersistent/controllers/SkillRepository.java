package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Skill;

import java.util.List;

public interface SkillRepository {
    Object findAll();

    Object findAllById(List<Integer> skills);

    void save(Skill newSkill);
}
