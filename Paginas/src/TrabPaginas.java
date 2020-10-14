import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrabPaginas {

		private final static Integer limite = 10;
		private static List<Integer> paginas = new ArrayList<>();
		private static List<Integer> ram = new ArrayList<>();
		
		public static void main(String[] args) {		
			
			paginas.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,12));
			show();
			int len = paginas.size();
			for(int i = 0; i < len; i ++) {
				if(ram.size() < limite) {
					add();
				}else {
					if(ram.contains(paginas.get(0))) {
						remove();
					}else {
						addAndReplace();
					}
				}
				show();
			}		
		}
		
		private static void show() {
			System.out.println(paginas);
			System.out.println(ram);
		}
		
		private static void add() {
			ram.add(paginas.get(0));
			paginas.remove(0);
		}
		
		private static void addAndReplace() {
			ram.remove(0);
			ram.add(paginas.get(0));
			paginas.remove(0);
		}
		
		private static void remove() {
			paginas.remove(0);
		}
		
	}
