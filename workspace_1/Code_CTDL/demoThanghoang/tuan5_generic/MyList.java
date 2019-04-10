package tuan5_generic;

public class MyList{
    Node head,tail;
    MyList(){head=tail=null;}
    boolean isEmpty(){return head==null;}
    void clear(){head=tail=null;}

    void themVaoPhanTuCuoi(int x){
        Node q=new Node(x);
        if(isEmpty()){
            head=tail=q;
            return;
        }
        tail.next=q;
        tail=q;
    }
    void themVaoPhanTuDau(int y){
        Node p=new Node(y);
        if(isEmpty()){
            head=tail=p;
            return;
        }
        head.next=p;
        head=p;
    }
    void traverse(){
        Node p=head;
        while(p!=null){
            System.out.print(" "+ p.info);
            p=p.next;
        }
        System.out.println();
    }
    public void xoaPhanTuDau(){        
        if(isEmpty()){return;}
        if(head==tail)head=tail=null; else
        head=head.next;
    }
    void deleteLast(){
        Node tmp;
        if(isEmpty()) {return;}
        if(head.next==null){head=tail=null; return;}
        tmp=head;
        while(tmp.next!=tail){tmp=tmp.next;}
        tmp.next=null;
        tail=tmp;
    }
    void addBefore(Node h,int x){
        if(h==null) return;
        if(isEmpty()) return;
        Node f,p;
        f=null; p=head;
        while(p!=null){
            if(p==h) break;
            f=p;
            p=p.next;
        }
        if(p==null) return;
        if(f==null){themVaoPhanTuDau(x); return;}
        Node q=new Node(x);
        q.next=h;
        f.next=q;
    }
    void addAfter(Node h, int x){
        if(h==null) return;
        Node q=new Node(x);
        q.next=h.next;
        q.next=q;
        if (h==tail) tail=q;
    }
    void addMany(int[]a){
        int i,n;
        n=a.length;
        for(i=0;i<n;i++) themVaoPhanTuCuoi(a[i]);
    }
    Node search(int x){
        Node p=head;
        while(p!=null){
            if(p.info==x) return(p);
            p=p.next;
        }
        return null;
    }
    void delete(Node h){
        if(h==null) return;
        if(isEmpty()) return;
        Node f,p;
        f=null;
        p=head;
        while(p!=null){
            if(p==h) break;
            f=p;
            p=p.next;
        }
        if(p==null)return;
        if(f==null){
            head=head.next;
            if(head==null)tail=null;
            return;
        }
         f.next=h.next;
         if(f.next==null)tail=f;
    }
    void xoaPhanTuBatKy(int k){
        int i=0;
        Node p=head;
        while(p!=null){
            if(i==k)break;
            p=p.next;
            i++;
            }
        delete(p);
    }
    void sort(){
        Node pi,pj;
        int t;
        pi=head;
        while(pi!=null){
            pj=pi.next;
            while(pj!=null){
                if(pj.info<pi.info){
                    t=pi.info;
                    pi.info=pj.info;
                    pj.info=t;
                }
                pj=pj.next;
            }
            pi=pi.next;
        }
    }
     int count(){
         int i=0;
         while(head!=null){
             ++i;
             head=head.next;
         }
         return i;


     }
}
