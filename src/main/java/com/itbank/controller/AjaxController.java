package com.itbank.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.TodoDAO;
import com.itbank.model.TodoDTO;

@RestController
public class AjaxController {
	
	@Autowired
	private TodoDAO dao;

	@GetMapping("/list")
	public List<TodoDTO> list() {
		return dao.list();
	}
	
	@PostMapping("/write")
	public int write(@RequestBody HashMap<String, String> map) {
		return dao.write(map);
	}
	
	@DeleteMapping("/{idx}")
	public int delete(@PathVariable int idx) {
		return dao.delete(idx);
	}
}
