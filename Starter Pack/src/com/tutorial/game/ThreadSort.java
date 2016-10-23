import java.util.*;
import java.net.*;
import java.io.*;

public class ThreadSort {
  public static void main(String[] args) {
   int[] list = {1, 5, 3, 7, 9, 11, 2, 5};
   ArrayList<Integer> front = toArrayList(
     Arrays.copyOfRange(list, 0, list.length/2));
   ArrayList<Integer> back = toArrayList(
   	Arrays.copyOfRange(list, list.length/2, list.length));
   ThreadArray first = new ThreadArray(front);
   ThreadArray second = new ThreadArray(back);
   Thread fronth = new Thread(new ThreadArray(front));
   Thread backth = new Thread(new ThreadArray(back));
   fronth.start();
   backth.start();
   try{
   	  fronth.join();
   	  backth.join();
   } catch(InterruptedException e){
   	System.out.println(e);
   }
   Thread merge = new Thread(new Merge(front, back));
   merge.start();
   try{
   	  merge.join();
   } catch(InterruptedException e){
   	System.out.println(e);
   }
   System.out.println(front);
  }

  public static ArrayList<Integer> toArrayList(int[] inlist){
  	ArrayList<Integer> temp = new ArrayList<Integer>();
  	for (int i = 0; i < inlist.length; i++){
	    temp.add(inlist[i]);
	}		
	return temp;
  }
  static class ThreadArray extends ArrayList implements Runnable
  {
		private ArrayList<Integer> list;
		public ThreadArray(ArrayList<Integer> temp) {
          list = temp;
		}
		public void add(Integer temp) {
	        this.list.add(temp);
		}
		public Integer popf() {
	      Integer temp = (Integer) this.get(0);
	      this.remove(0);
	      return temp;
		}
		public void run() {
		  Collections.sort(list);
		}
	}

	static class Merge implements Runnable
	{
		private ArrayList<Integer> fhalf;
		private ArrayList<Integer> lhalf;
		public Merge(ArrayList<Integer> fhalf, ArrayList<Integer> lhalf) {
			this.fhalf = fhalf;
			this.lhalf = lhalf;
		}
		public void run() {
	      fhalf.addAll(lhalf);
        Collections.sort(fhalf);	      
		}
    }
}