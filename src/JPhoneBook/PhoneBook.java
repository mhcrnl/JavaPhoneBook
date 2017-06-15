package JPhoneBook;

import lombok.Data;

public @Data class PhoneBook {
	private String nume;
	private String prenume;
	private String nrTel;
	
	public static void main(String args[]){
		PhoneBook pb = new PhoneBook();
		pb.setNume("Mihai");
		System.out.println(pb.toString());
	}
}
