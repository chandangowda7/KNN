import java.io. * ;
import java.util. * ;
class knear {
	public static void main(String args[]) throws IOException {
		Scanner x = new Scanner(new File("cancer.txt"));
		ArrayList < Integer > a = new ArrayList < Integer > ();
		ArrayList < Character > classi = new ArrayList < Character > ();
		int h;
		char c;
		int k = 0;
		while (x.hasNextLine()) {
			h = x.nextInt();
			c = x.next().charAt(0);
			a.add(h);
			classi.add(c);
			k++;

		}

		double dis[] = new double[k];
		char cl[] = new char[k];
		int q = 8;
		for (int i = 0; i < k; i++) {
			dis[i] = Math.sqrt((q - a.get(i)) * (q - a.get(i)));
			System.out.println(dis[i]);
			cl[i] = classi.get(i);
		}
		for (int i = 0; i < k; i++) {
			for (int z = i + 1; z < k; z++) {
				if (dis[i] > dis[z]) {
					double t = dis[z];
					dis[z] = dis[i];
					dis[i] = t;
					char tc = cl[z];
					cl[z] = cl[i];
					cl[i] = tc;
				}
			}
		}
		int classc = 0,
		classn = 0;
		for (int i = 0; i < 4; i++) {
			if (cl[i] == 'c') classc++;
			else classn++;
		}
		if (classc > classn) System.out.print("classc");
		else System.out.print("classn");
	}
}