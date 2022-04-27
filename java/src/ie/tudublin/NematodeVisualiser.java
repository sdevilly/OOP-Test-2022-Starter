package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
    ArrayList<nematode> nematodes = new ArrayList<nematode>();

	public float edge;
	public int i;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			if (i == 0)
			{
				i = 12;
			}
			else 
			{
				i--;
			}
		}	
		
		if (keyCode == RIGHT)
		{
			if (i == 12)
			{
				i = 0;
			}
			else
			{
				i++;
			}
		}
	}

	void drawCircles()
	{
		stroke(255, 0, 0);
		for(nematode n:nematodes)
		{
			// I forgot how to only read the first line of code so I had to hard code it
			if(i==0)
			{
				float p = n.getLength();
				for(int j=0;j<=2; j++) // hard coded
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
					stroke(255,0,0);
				}
			}
			else if(i==1)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=4; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==2)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=6; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==3)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=2; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==4)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=3; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==5)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=1; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==6)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==7)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=7; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==8)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=3; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==9)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=0; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==10)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==11)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==12)
			{
				clear();
				float p = n.getLength();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
		}

		// for(j=0; j<=8; j++)
		// { 
		// float x = map(j, 0, 8, width - edge);
		// circle(width / 2, x, 80);
		// }
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
		loadNematodes();
		showNematodes();

		edge = width * 0.1f;
	}
	
	void showNematodes()
	{
		for(nematode n:nematodes)
		{
			System.out.println(n);
		}
	}
	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for(TableRow r:table.rows())
		{
			nematode n = new nematode(r);
			nematodes.add(n);
		}
	}

	public void draw()
	{	
		drawCircles();
	}
}
