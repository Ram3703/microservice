package com.ram.DetailInfo.Model;

public class Team {
	private int teamno;
	private String teamname;
	private String ownername;
	
	
	public Team() {
		super();
	}
	public Team(int teamno, String teamname, String ownername) {
		super();
		this.teamno = teamno;
		this.teamname = teamname;
		this.ownername = ownername;
	}
	public int getTeamno() {
		return teamno;
	}
	public void setTeamno(int teamno) {
		this.teamno = teamno;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "Team [teamno=" + teamno + ", teamname=" + teamname + ", ownername=" + ownername + "]";
	}
	
	
}
