package rule;

public abstract class JudgeFeature {
	public abstract void Skill();
	public abstract void KillObject();
	
	private boolean BeAttacked ;
	private boolean Undead;
	private boolean JudgeMode;
	

	public boolean GetBeAttacked() {
		return BeAttacked;
	}
	
	public void SetBeAttacked(boolean BeAttacked) {
		this.BeAttacked = BeAttacked;
	}
	
	public boolean GetUndead() {
		return Undead;
	}
	
	public void SetUndead(boolean Undead) {
		this.Undead = Undead;
	}
	
	public boolean GetJudgeMode() {
		return JudgeMode;
	}
	
	public void SetJudgeMode(boolean JudgeMode) {
		this.JudgeMode = JudgeMode;
	}
	
	public abstract void ControlTheGame(boolean ContrlMode); 
	
	public abstract void UnderwriteTheHuman(boolean Underwrite);
}
