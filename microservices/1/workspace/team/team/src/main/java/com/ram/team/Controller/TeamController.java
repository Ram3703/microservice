package com.ram.team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.team.Dao.TeamDao;
import com.ram.team.Model.Team;

@RestController
public class TeamController {
	@Autowired
	TeamDao td;
	
	@RequestMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeams();
	}

}
