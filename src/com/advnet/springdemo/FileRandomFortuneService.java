package com.advnet.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService {
	
	private List<String> data = new ArrayList<>();
	private Random myRandom = new Random();
	
	public FileRandomFortuneService(@Value("${fileRndFortuneService.file}") String fn) {
		try (BufferedReader br = new BufferedReader(new FileReader(fn))){
			String l;
			while (( l = br.readLine())!=null) {
				data.add(l);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String getFortune() {
		return data.get(myRandom.nextInt(data.size()));
	}

}
