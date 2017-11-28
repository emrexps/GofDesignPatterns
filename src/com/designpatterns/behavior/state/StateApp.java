package com.designpatterns.behavior.state;

import java.io.IOException;
import java.io.InputStreamReader;

public class StateApp {

	public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader( System.in );
        Button btn = new Button();
        while (true) {
            System.out.print("Press 'Enter'");
            is.read();
            btn.push();
        }
    }
	
}
