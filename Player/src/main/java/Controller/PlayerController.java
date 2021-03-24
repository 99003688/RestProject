package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.PlayerDAO;
import model.Player;
import java.util.List;

@RestController
public class PlayerController {
	@Autowired
	PlayerDAO td;
	
	@GetMapping(value="/players")
	public List<Player>index(){
		return td.getAllPlayers();
		
	}
	

}
