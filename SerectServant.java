package servant;


interface SerectFunction{
	void SerectInfo();
}


public  class SerectServant extends ServantClass implements SerectFunction {
	
		boolean Undead;
		String sndNP; 
		int SndHP;
		int TakeOverTime;
		
	public void SerectInfo() {
		// TODO Auto-generated method stub

		 name= "";
		 Power = 0;
		 HP = 0;
		 Mana = 0;
		 PhysicDamage = 0;
		 MagicDamage = 0;
		 DeadorAlive = true ;
		 NP = "Creating and Removing";
		 int smart = 5000;
		 
		 
		 System.out.println("Power: "+Power);
		 System.out.println("HP: "+HP);
		 System.out.println("Physics Damage: "+PhysicDamage);
		 System.out.println("Magic Damage: "+MagicDamage);
		 System.out.println("Dead or Alive: "+DeadorAlive);
		 System.out.println("Mana: "+Mana);
		 System.out.println("NP: "+NP);
		 System.out.println("Smart(Special Element): "+ smart);


	}

}
