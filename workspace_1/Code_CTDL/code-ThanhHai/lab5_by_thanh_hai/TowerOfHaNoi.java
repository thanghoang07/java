package lab5_by_thanh_hai;

import javax.activation.MailcapCommandMap;

public class TowerOfHaNoi{
	private static MyDynamicStack[] tower;
    public static void towersOfHanoi(int n) {
 
        tower = new MyDynamicStack[4];
        for (int i = 0; i <= 3; i++){
            tower[i] = new MyDynamicStack(4);
        }
        for (int d = n; d > 0; d--){
            tower[1].push(new Integer(d));
        }
        showTowerStates(n, 1, 2, 3);
    }
 
    public static void showTowerStates(int n, int x, int y, int z) {
         
        if (n > 0) {
            try{
                showTowerStates(n - 1, x, z, y);
                Integer d = (Integer) tower[x].pop();
                tower[y].push(d);
                System.out.println("Chuyen dia " + d
                        + " tu cot "+ x + " sang cot " + y);
                showTowerStates(n - 1, z, y, x);
            } catch(Exception ex){}
        }
    }
}
 
	class MyDynamicStack {
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    public MyDynamicStack(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    public void push(int entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full."));
            this.increaseStackCapacity();
        }
        this.stackArr[++top] = entry;
    }
 
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty.");
        }
        int entry = this.stackArr[top--];
        return entry;
    }
     
    public long peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) {
        MyDynamicStack stack = new MyDynamicStack(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
	
}
