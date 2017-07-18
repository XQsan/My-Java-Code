package servant;


interface Status{
	public void SaberStatus(int health_score);
	public void ArcherStatus(int health_score);
	public void LancerStatus(int health_scoren);
	public void AssasinStatus(int health_score);
	public void CasterStatus(int health_score);
	public void RiderStatus(int health_score);
	public void BerserkerStatus(int health_score);
	public void BellaStatus(int health_score);
}

public class ServantStatus implements Status{

	public void HelloWorld() {
		System.out.println("Hello World");
	}
	
	public void SaberStatus(int health_score) {
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Saber is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Saber needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Saber will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Saber is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}

		
	}

	public void ArcherStatus(int health_score) {
		// TODO Auto-generated method stub

		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Archer is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Archer needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Archer will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Archer is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}

	public void LancerStatus(int health_score) {
		// TODO Auto-generated method stub

		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Lancer is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Lancer needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Lancer will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Lancer is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}
	

	public void AssasinStatus(int health_score) {
		
		// TODO Auto-generated method stub

		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Assansin is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Assasin needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Assasin will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Assasin is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}

	public void CasterStatus(int health_score) {
		// TODO Auto-generated method stub

		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Caster is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Caster needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Caster will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Caster is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}
		

	public void RiderStatus(int health_score) {
		// TODO Auto-generated method stub

		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Rider is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Rider needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Rider will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Rider is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}
	

	public void BerserkerStatus(int health_score) {
		// TODO Auto-generated method stub
		 
		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println("Berserker is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Berserker needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Berserker will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Berserker is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}
	

	public void BellaStatus(int health_score) {
		// TODO Auto-generated method stub
		
		
		if(health_score >= 100 || health_score < 0) {
		
			if (health_score == 100) {
				System.out.println(" Bella is healthy");
		
			}
			else if(health_score == 50) {
				System.out.println("Bella needs to be relax");
			}
		
			else if(health_score == 0) {
				System.out.print("Warning, Bella will die");
			}
			
			else if(health_score > 50 && health_score < 100) {
				System.out.println("Bella is normal");
			}
			
	}
		
		else {
			System.out.println("Wrong score");
		}
	}
}
	

