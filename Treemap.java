
import java.util.Map;
import java.util.*;
	public class Treemap {
		public static void main(String[] args) {
			Map<Integer,String> hm=new TreeMap<>();
			addele(hm);
			for(Integer s:hm.keySet()) {
				System.out.println(s+""+hm.get(s));
			}
		}
	public static void addele(Map<Integer,String>hm) {
		hm.put(1,"suchi");
		hm.put(2,"supi");
		hm.put(3,"hani");
		hm.put(4,"sumi");
	}
	}

