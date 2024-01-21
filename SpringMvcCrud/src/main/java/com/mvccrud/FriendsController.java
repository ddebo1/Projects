package com.mvccrud;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvccrud.entity.Friends;
import com.mvccrud.service.FriendsService;

@Controller
@RequestMapping("/friends")
public class FriendsController {
	
	private FriendsService service;
	
	public FriendsController(FriendsService service) {
		super();
		this.service = service;
	}
	
	@GetMapping	("/list")
	public String listAllFriends(Model model){
		List<Friends> frnds = service.findAll();
		model.addAttribute("friends", frnds);		
		return "list-friends";
	}
	
	@GetMapping	("/showFormForAdd")
	public String showFormForAdd(Model model){
		
		Friends friends = new Friends();
		
		model.addAttribute("friends", friends);
		
		return "friends-form";	
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("friends") Friends friends){
		
		service.save(friends);
		
		return "redirect:/friends/list";
		
	}
	
	@GetMapping	("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("friendsId") int id, Model model){
		
		System.out.println("Method called");
		Friends friends = service.findById(id);
		
		model.addAttribute("friends", friends);
	
		return "friends-form";	
	}
	
	@GetMapping	("/delete")
	public String delete(@RequestParam("friendsId") int id){
		
		service.deleteById(id);
	
		return "redirect:/friends/list";	
	}	

}
