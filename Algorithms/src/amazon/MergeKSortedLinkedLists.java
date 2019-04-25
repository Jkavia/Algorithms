package amazon;
import java.util.*;

public class MergeKSortedLinkedLists {

	public static void main(String[] args) {
	Listnode head1 = new Listnode(1);
	head1.next = new Listnode(5);head1.next.next = new Listnode(7);
	Listnode head2 = new Listnode(3);
	head2.next = new Listnode(4);head2.next.next = new Listnode(9);
	Listnode head3 = new Listnode(2);
	head3.next = new Listnode(4);head3.next.next = new Listnode(6);
	
	List<Listnode> overalllist = new ArrayList<>();
	overalllist.add(head1);overalllist.add(head2);overalllist.add(head3);
	Listnode outputhead = mergerksortedlists(overalllist);
	while(outputhead!=null) {
		System.out.print(outputhead.value+" ");
		outputhead = outputhead.next;
	}
	
	}

	private static Listnode mergerksortedlists(List<Listnode> overalllist) {
		if(overalllist==null || overalllist.size()==0) {
			return null;
		}
        PriorityQueue<Listnode> queue= new PriorityQueue<Listnode>(overalllist.size(),new Comparator<Listnode>(){
            @Override
            public int compare(Listnode o1,Listnode o2){
                if (o1.value<o2.value) {
                    return -1;
                } else if (o1.value==o2.value) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        
        Listnode temp = new Listnode(0);
        Listnode tail = temp;
        
        for(Listnode l:overalllist) {
        	queue.add(l);
        }
        
        while(!queue.isEmpty()) {
        	tail.next = queue.poll();
        	tail = tail.next;
        	
        	if(tail.next!=null) {
        		queue.add(tail.next);
        	}
        }
        
		return temp.next;
	}

}
