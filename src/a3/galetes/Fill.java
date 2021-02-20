package a3.galetes;


public class Fill implements Runnable  {
	private String Nom;
	private Familia fa;

	public Fill(Familia f, String nom) {
		fa=f;
		Nom = nom;
	} 
	
	public Fill() {
		super();
	}

	public Fill(String nom) {
		super();
		Nom = nom;
	}
	

	@Override
	public void run() {
		fa.agafaGaletes(1);
		System.out.println("Sóc " + Nom + " galetes que queden = " + fa.getGaletes());
	}
	
		

}