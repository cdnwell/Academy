package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerMain {
	
	public static void main(String[] args) {
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			server = new ServerSocket(5000);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String str = br.readLine();
			int num = Integer.parseInt(str);

			Random rand = new Random();
			int[] lottoStore = new int[6];
			int randNum;
			for (int i = 0; i < 6; i++) {
				lottoStore[i] = 0;
			}

			for (int i = 0; i < num; i++) {
				for (int k = 0; k < 6; k++) {
					randNum = rand.nextInt(45) + 1;
					for (int l = 0; l < 6; l++) {
						if (lottoStore[l] == randNum) {
							randNum = rand.nextInt(45) + 1;
							l = -1;
						}
					}
					lottoStore[k] = randNum;
				}
				pw.print(num-i + "set : [");
				for (int j = 0; j < 5; j++) {
					pw.print(lottoStore[j] + ", ");
				}
				pw.print(lottoStore[5]);
				pw.print("]\n");
				pw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
