package servant;

interface BellaFunction{
	default void UniqueNoblePhantasm() {
		String What_is_its_name =  "Ankhseram";
		String summon = "Acnologia";
		boolean ZerefMode = true;
		final boolean immortal =  true;
		final boolean BellaAwake =  true;
		
		System.out.println("Name of Noble phantasm: "+ What_is_its_name);
		System.out.println("Special: Summon: "+ summon);
		System.out.println("Zeref mode: "+ ZerefMode);
		System.out.println("immortal: "+ immortal);
		System.out.println("Awake: "+ BellaAwake);	
	}
}

public class Bella extends SerectServant implements BellaFunction{

	String name= "Bella";
	int Power = 10000;
	int HP = 100000;
	int  Mana = 10000;
	int PhysicDamage = 100000;
	int MagicDamage = 1200000;
	boolean DeadorAlive = true ;
	
	public void BellaInfomation() { 
		System.out.println("Name: "+ name);
		System.out.println("Power: "+ Power);
		System.out.println("HP: "+HP);
		System.out.println("Mana: "+Mana);
		System.out.println("Physic Damage: "+ PhysicDamage);
		System.out.println("Magic Damage: "+ MagicDamage);
		System.out.println("Dead or Alive: "+ DeadorAlive);
	}
	

	
	}
	

