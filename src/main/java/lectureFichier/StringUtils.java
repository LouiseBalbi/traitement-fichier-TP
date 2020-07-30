package lectureFichier;

public class StringUtils {
	
	String chaine;
	
	// suppression les caractères spéciaux des chaines de caractères récupérées depuis le fichier csv
	public static String traitementCaracteresSpe(String chaine){
		return chaine.replace("'", "''").replace("\\", "").replace("*", "").replace("_", " ")
				.replaceAll("[0-9]*\\s*%", "").trim().replaceAll("\\(.*\\)", "").trim().replaceAll("[0-9]*\\s*\\.", "").trim();
	}
	
	
	// conversion de type String à double
	// si la chaine ne comprend pas de nombre, 0 est retourné
	public static double toDouble(String chaine) {
		if(!chaine.isEmpty()) {
			try {
				return Double.parseDouble(chaine);
			} catch (Exception e) {				
				System.out.println("Mauvais format dans la String : " + e.getMessage());
				return 0.0;
			}
			
		}else {
			return 0.0;
		}
	}

}
