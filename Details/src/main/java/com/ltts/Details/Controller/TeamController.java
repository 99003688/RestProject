package com.ltts.Details.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.Details.model.Team;

@RestController
public class TeamController {
	@Autowired
	RestTemplate rt;
	
	  @GetMapping("/detail")
		public List<Team> getExternalTeam(){
			
			
			ResponseEntity<Team[]> response =
					  rt.getForEntity(
					  "http://localhost:3001/teams/",
					  Team[].class);
					Team[] teams = response.getBody();
					List<Team> lt=Arrays.asList(teams);
					return lt;
		}

}
