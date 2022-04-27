package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;


public class NematodeVisualiser extends PApplet
{
	Minim minim;
	AudioPlayer ap;
	AudioBuffer ab;
    ArrayList<nematode> nematodes = new ArrayList<nematode>();
	float halfH = height / 2;
	float[] lerpedBuffer;

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
				String l = n.getLimbs();
				boolean k = n.isEyes();

				for(int j=0;j<=2; j++) // hard coded
				{
					//float f = lerpedBuffer[i] * halfH * 4.0f;
					float x = map(j, 0, 8, edge, width - edge);
					stroke(255,0,0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==1)
			{
				clear();
				for(int j=0; j<=4; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(255,215,0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==2)
			{
				clear();
				for(int j=0; j<=6; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(255, 255, 0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==3)
			{
				clear();
				for(int j=0; j<=2; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(0, 255, 0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==4)
			{
				clear();
				for(int j=0; j<=3; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(0, 150, 0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==5)
			{
				clear();
				for(int j=0; j<=1; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(0, 0, 150);
					circle(width / 2, x, 80);
				}
			}
			else if(i==6)
			{
				clear();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(0, 0, 200);
					circle(width / 2, x, 80);
				}
			}
			else if(i==7)
			{
				clear();
				for(int j=0; j<=7; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(0, 0, 255);
					circle(width / 2, x, 80);
				}
			}
			else if(i==8)
			{
				clear();
				for(int j=0; j<=3; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(255, 0, 255);
					circle(width / 2, x, 80);
				}
			}
			else if(i==9)
			{
				clear();
				for(int j=0; j<=0; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(150, 0, 0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==10)
			{
				clear();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					stroke(200, 0, 0);
					circle(width / 2, x, 80);
				}
			}
			else if(i==11)
			{
				clear();
				for(int j=0; j<=5; j++)
				{
					float x = map(j, 0, 8, edge, width - edge);
					circle(width / 2, x, 80);
				}
			}
			else if(i==12)
			{
				clear();
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
		minim = new Minim(this);
        ap = minim.loadFile("heroplanet.mp3", 1024); 
        ap.play();
        ab = ap.mix;

		colorMode(HSB);
		background(0);
		smooth();		
		loadNematodes();
		showNematodes();

		lerpedBuffer = new float[width];
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
