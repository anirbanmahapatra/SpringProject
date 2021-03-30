package com.cg.mts.entities;

public class UniversityStaffManager {
		private int staffId;
		private String password;
		private String role;
		public UniversityStaffManager(int staffId, String password, String role) {
			super();
			this.staffId = staffId;
			this.password = password;
			this.role = role;
		}
		public int getStaffId() {
			return staffId;
		}
		public void setStaffId(int staffId) {
			this.staffId = staffId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "UniversityStaffManager [staffId=" + staffId + ", password=" + password + ", role=" + role + "]";
		}
		
		
}
