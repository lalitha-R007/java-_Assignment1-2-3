package com.ninja.training;

public class Homeclass_objects {
	//Home class is the kind of a method having different data types of parameters (name, area, noOfRooms)
	private String name;
	private double area;
	private int noOfRooms;
	private int noOfFloors;
	
	public void setName (String HomeName) {
		name = HomeName;}
	public void setArea (double HomeArea) {
		area = HomeArea;}
	public void setRooms (int HomeRooms) {
		noOfRooms = HomeRooms;}
	public void setFloors (int HomeFloors) {
		noOfFloors = HomeFloors;}
	
	public String getName () {
		return name;}
	public double getArea () {
		return area;}
	public int getRooms () {
		return noOfRooms;}
	public int getFloors () {
		return noOfFloors;}
	
	public void CleanUp() {
		System.out.println(name + " home is cleaned.");}
	public void PainIt() {
		System.out.println(name + " home is painted.");}
	

}
