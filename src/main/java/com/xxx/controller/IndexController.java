package com.xxx.controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("a")
	public String index(Model model){
		model.addAttribute("a", "123");
		return "index";
	}
	@RequestMapping("b")
	public String test(){
		return "test";
	}
	
	
	public static void main(String[] args) {
		List<Foo> list = new ArrayList<Foo>();
		for(int i=0;i<10;i++){
			Foo f = new Foo((long) i,"name"+i,new Date(10-i));
			list.add(f);
		}
		Foo f = new Foo((long) 4,"name1",new Date(10-4));
		System.out.println(Collections.binarySearch(list, f));
		for(Foo ff : list){
			System.out.println(ff);
		}
		
	}
	
}
class Foo implements Comparable<Foo>{
	Long id;
	String name;
	Date date;

	public Foo(Long id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public int compareTo(Foo o) {
		if(date.after(o.date)){
			return -1;
		}else if(date.before(o.date)){
			return 1;
		}else {
			if(id==o.id){
				return 0;
			}else{
				return -1;
			}
		}
	}

	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + ", date=" + date.getTime() + "]";
	}
	
}