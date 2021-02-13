package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("skills")
public class SkillController<newSkill> {
    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("add")
    public String displayAddSkillForm(Model model) {
        model.addAttribute(new Skill());
        model.addAttribute("skillID");
        return "skills/add";
    }

    @PostMapping("add")
    public String processAddSkillForm(@ModelAttribute @Valid Skill newSkill, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Skill");
        }
        skillRepository.save(newSkill);
        return "redirect";
    }

    public SkillController(SkillRepository skillRepository)

    {
        this.skillRepository = skillRepository;
    }
 public SkillRepository getSkillRepository() {
    return skillRepository;
}

public void setSkillRepository(SkillRepository skillRepository) {
    this.skillRepository = skillRepository;
}}