package pkgs.pkgExes;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		try {
			Path temp = Paths.get("C:","temp");
			WatchService watcher = FileSystems.getDefault().newWatchService();
			temp.register(watcher, StandardWatchEventKinds.ENTRY_DELETE);
			while (true) {
				System.out.println("while...");
				WatchKey key;
				try {
					key = watcher.take();
				} catch (InterruptedException e) {
					e.printStackTrace();
					return;
				}
				for(WatchEvent<?> event : key.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();
					System.out.println("[="+(kind.name())+"]");
					System.out.println("[="+(kind.type())+"]");
					System.out.println("[="+(event.context())+"]");
					String name = event.context().toString();
					if(name.equals("directoryToDelete")) {
						System.out.println("Diretorio deletado...");
						return;
					}
				}
				key.reset();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*

*/

/*

*/

/*

*/
