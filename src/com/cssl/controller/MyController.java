package com.cssl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cssl.pojo.Student;
import com.sun.org.apache.bcel.internal.generic.NEW;


@Controller
@SessionAttributes(types=Student.class,names="dd")
public class MyController{
	
	
	@RequestMapping("/index")
	public String getmo(Integer id,Model model) {
		Student dd=new Student();
		if(id==1) {
			return "forward:login.jsp";
		}else {
			return "redirect:succee.jsp";
		}
	}
	
	
	
	
	/*@RequestMapping("/form4")
	public void ajax(Student student,HttpServletResponse response) throws IOException {
		System.out.println(student.getStuName());
		PrintWriter out=response.getWriter();
		if(student!=null&&student.getStuName()!=null) {
			out.println(1);
		}else {
			out.println(0);
		}
		out.flush();
		out.close();
	}

	
	@RequestMapping("/form5")
	public List<Student> ajax2(Student student) throws IOException {
		System.out.println(student.getStuName());
		List<Student> students=new ArrayList<>();
		students.add(new Student("�����", "������"));
		students.add(new Student("������","������"));
		students.add(new Student("������","������"));
		return students;
	}*/
/*	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ddddddddddddddddddddddddddddddddd");
		return null;
	}
*/
	
	/*
	 * ע�����
	 * 
	 * @RequestMapping("/form1")
	public ModelAndView getForm1(Student stu) {
		System.out.println(stu.getStuName());
		System.out.println(stu.getAddress());
		System.out.println("ddddddddddd");
		ModelAndView mav=new ModelAndView("forward:/redire");
		return mav;
	}
	
	@RequestMapping("/redire")
	public String getRedire(Student stu) {
		System.out.println(stu.getStuName());
		System.out.println(stu.getAddress());
		return "succee";
	}*/
	
	
	/*ע������
	 * 
	 * @RequestMapping("/form2")
	public String   getArray(String [] stuName) {
		for (String string : stuName) {
			System.out.println(string);
		}
		return "succee";
	}*/
	
	/*@RequestMapping("/form3")
	public String getMap(@RequestParam List<String> stuName) {
		System.out.println(stuName.size());
		for (String string : stuName) {
			System.out.println(string);
		}
		return "succee";
	}*/
	
	
	/* @RequestMapping("/form3")
		public ModelAndView getForm1(Conllec c) {
		 	for (Student s : c.getStudents()) {
				System.out.println("����"+s.getStuName());
				System.out.println("��ַ:"+s.getAddress());
			}
			ModelAndView mav=new ModelAndView("forward:/succee.jsp");
			return mav;
		}*/
	
	
}
