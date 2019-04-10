package agent;

public abstract class Agent {

   //phuong thuc nhan thuc cua Agent 
	public abstract void see(Percept p);

   //Agent lua chon hanh dong tiep theo
   public abstract Action selectAction();
   
   //Quan ly moi truong co nhieu con Agent
   public abstract String getId();

}

