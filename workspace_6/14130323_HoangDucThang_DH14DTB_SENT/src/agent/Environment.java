package agent;

import java.util.ArrayList;

public abstract class Environment {

   //Danh sach cac Agent
   protected ArrayList<Agent> agents = null;

   //Trang thai hien tai cua moi truong
   protected State state = null;

  public Environment() {

      agents = new ArrayList<Agent>();
   }

   //Them vao Agent moi
   public abstract void addAgent(Agent agent);

   //Chay moi truong gia lap
   public void start(State initState) {

      int numAgents;
      Percept p;
      Action action;
      Agent a;

      state = initState;
      state.display();

      numAgents = agents.size();
      while (!isComplete()) {
         for (int i=0; i < numAgents; i++) {
            a = (Agent)agents.get(i);
            p = getPercept(a);
            a.see(p);
            action = a.selectAction();
            updateState(a, action);
            state.display();
         }
      }
   }

   // Kiem tra chuong trinh gia lap da xong chua
   protected abstract boolean isComplete();

   
   //Lay nhan thuc cua Agent
   protected abstract Percept getPercept(Agent a);

    
   // Thuc hien hanh dong va cap nhat lai trang thai cua moi truong
   protected void updateState(Agent a, Action action) {

      state = action.execute(a, state);
   }

   //Ham danh gia ham muc tieu (cang cao cang tot) co the
  // public abstract int getTeamPerformanceMeasure();


   // Ham danh gia 1 con Agent
   public abstract int getPerformanceMeasure(Agent a);

}



