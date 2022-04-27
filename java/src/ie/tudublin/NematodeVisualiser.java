package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
    ArrayList<nematode> nematodes = new ArrayList<nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "headers");
		for(TableRow r:table.rows())
		{
			nematode n = new nematode(r);
			nematodes.add(n);
		}
	}

	public void draw()
	{	
	}
}
