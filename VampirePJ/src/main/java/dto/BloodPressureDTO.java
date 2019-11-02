package dto;

public class BloodPressureDTO {
	private int bp_id;
	private int sys;
	private int dia;
	private int p;
	private String checktime;
	private String user_id;
	
	
	public int getBp_id() {
		return bp_id;
	}
	public void setBp_id(int bp_id) {
		this.bp_id = bp_id;
	}
	public String getChecktime() {
		return checktime;
	}
	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}
	public int getSys() {
		return sys;
	}
	public void setSys(int sys) {
		this.sys = sys;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
