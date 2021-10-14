// JAVA ENV
class Btree{
	char value;
	Btree left;
	Btree right;
	
	public void Btree(){
		
	}
	public Btree New_Nd(char val,Btree l,Btree r){
		this.value = val;
		this.left = l;
		this.right = r;
		return this;
	}
}

class BtreeFun{
	public Btree preOderCreate(String cmd,int[] ct){
		  if (cmd.charAt(ct[0]) != '_')
		  {
			Btree nd = new Btree();
			nd.New_Nd(cmd.charAt(ct[0]),null,null);
		  	ct[0]++;
		  	nd.left = preOderCreate(cmd,ct);
		  	nd.right = preOderCreate(cmd,ct);
		  	return nd;
		  }
		  else
		  {
		  	ct[0]++;
		  	return null;
		  }
		}
	
	public void preOrderVist(Btree obj){
		if (obj != null)
		{
			System.out.print(obj.value);
			preOrderVist(obj.left);
			preOrderVist(obj.right);
		}
	}
}

class LinkList{
	char data;
	LinkList next;
	public void LinkList(){
	}
	
	public LinkList New_Node(char data,LinkList next){
		this.data = data;
		this.next = next;
		return this;
	}
}

class LinkListFun{
	public LinkList createList(String valList){
		int index = 0;
		LinkList ret = new LinkList();
		LinkList op  = ret;
		if (valList.length() > 0)
		{
			for (int i=0;i<valList.length();i++)
			{
				LinkList nd = new LinkList();
				nd.New_Node(valList.charAt(index++),null);
				op.next = nd;
				op = op.next;
			}
			return ret;
		}
		else
			return null;
	}
	
	public void vistList(LinkList obj)
	{
		LinkList op = obj.next;
		while (op != null)
		{
			System.out.print(op.data);
			op = op.next;
		}
	}
}

public class EnterMain{
	public void EnterMain(){
		System.out.println("confirm function...");
	}
	
	public static void main(String[] args){
		/*
		String cmd = "abc__d__ef___";
		int[] ct = {0};
		BtreeFun treeInit = new BtreeFun();
		Btree mytree = treeInit.preOderCreate(cmd,ct);
		treeInit.preOrderVist(mytree);
		*/
		
		String valList = "abcdefg123";
		LinkListFun listop = new LinkListFun();
		LinkList mylist = listop.createList(valList);
		listop.vistList(mylist);
		
		System.out.println("\nFinishment Main...");

	}
}