package com.love2code.spring;

public class HappyFurtuneService implements FortuneService {

	@Override
	public String getFurtune() {
		//implementation for the interface for the Fortune.
		return "Returning the Happy Fortune Service";
	}
}
