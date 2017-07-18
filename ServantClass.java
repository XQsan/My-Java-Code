package servant;

public  class ServantClass  {
	
	
   protected double Power;
   protected double HP;
   protected double Mana;
   protected double PhysicDamage;
   protected double MagicDamage;
   protected boolean DeadorAlive;
	
	String NP; //NP stand for Noble Phantams
	String name;
	

	
	public void CharInfo() {
		// TODO Auto-generated method stub
		System.out.println("NAME: "+name);
		System.out.println("POWER: " +Power);
		System.out.println("HP:"+HP);
		System.out.println("MANA: "+Mana);
		System.out.println("PHYSIC DAMAGE: "+PhysicDamage);
		System.out.println("MAGIC DAMAGE: "+MagicDamage);
		System.out.println("NP: "+NP);
		System.out.println("DEAD OR ALIVE: "+DeadorAlive);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SABER
		System.out.println("Saber: ");
		
		Saber saber = new Saber();
		saber.CharInfo();
		
		//ARCHER
		System.out.println();
		
		System.out.println("ARCHER:");
		
		Archer archer = new Archer();
		archer.CharInfo();
		
		//ASSASIN
		System.out.println();
		
		System.out.println("ASSASSIN: " );
		
		Assasin assasin = new Assasin();
		assasin.CharInfo();
		
		
		//LANCER
		System.out.println();
		
		System.out.print("LANCER: ");
		
		Lancer lancer = new Lancer();
		lancer.CharInfo();
		
		
		//RIDER
		System.out.println();
		
		System.out.print("RIDER: ");
		
		Rider rider = new Rider();
		rider.CharInfo();
		
		//BERSERKER
		System.out.println();
		
		System.out.print("BERSERKER: ");
		
		Berserker berserker = new Berserker();
		berserker.CharInfo();
		
		//CASTER
		System.out.println();
		
		System.out.println("CASTER: ");
		
		Caster caster = new Caster();
		caster.CharInfo();
		
		//Serect 
		System.out.println();
		
		SerectServant none = new SerectServant();
		none.SerectInfo();
		
		System.out.println();
		
		Bella best = new Bella();
		best.BellaInfomation();
		
		System.out.println();
		
		System.out.println("Bella Skill");
		
		best.UniqueNoblePhantasm();
	
		System.out.println();
		
		System.out.println("Total Power");
		
		ServantClass SC = new ServantClass();
		
		ServantClass.TotalPower a = SC.new TotalPower();
		
		a.PrintTotal();
		
		System.out.println();
		
		System.out.println("Status");
		
		System.out.println();

		
		ServantStatus s = new ServantStatus();
		s.SaberStatus(100);
		
	}
	

	public class TotalPower {
		Archer a = new Archer();
		Assasin as = new Assasin();
		Saber sa = new Saber();
		Caster ca = new Caster();
		Berserker be = new Berserker();
		Rider ri = new Rider();
		Lancer la = new Lancer();
		
		Bella b = new Bella();
		SerectServant SC = new SerectServant();
					 
		double Archer = a.Power + a.PhysicDamage + a.MagicDamage;
		double Assasin = as.Power + as.PhysicDamage + as.MagicDamage;
		double Saber = sa.Power + sa.PhysicDamage + sa.MagicDamage;
		double Caster = ca.Power + ca.PhysicDamage + ca.MagicDamage;
		double Rider = ri.Power + ri.PhysicDamage + ri.MagicDamage;
		double Lancer = la.Power + la.PhysicDamage + la.MagicDamage;
		double Bella = b.Power + b.PhysicDamage + b.MagicDamage;
		double Berserker = be.Power + be.PhysicDamage + be.MagicDamage;
		
		
		String Archer_score = "Archer: " + "" +  Archer;
		String Assasin_score = "Assasin" + Assasin;
	    String Saber_score = "Saber: " + Saber;
		String Caster_score = "Caster:" + Caster;
		String Berserker_score = "Berserker: " + Berserker;
		String Rider_score = "Rider: " + Rider;
		String Lancer_score = "Lancer: " + Lancer;
		String Bella_score = "Bella: " + Bella;
		
		public void PrintTotal() {
			System.out.println(Archer_score);
			System.out.println(Assasin_score);
			System.out.println(Saber_score);
			System.out.println(Caster_score);
			System.out.println(Berserker_score);
			System.out.println(Rider_score);
			System.out.println(Lancer_score);
			System.out.println(Bella_score);
		}


		
	}
}
