package es.iesjandula.plataforma_streaming_equipo1.subtitles;

import java.util.Arrays;
import java.util.Scanner;

import es.iesjandula.plataforma_streaming_equipo1.utilities.ScreenUtilities;
/**
 * 
 * @author Luis David
 *
 */
public class SubtitlesOptions 
{
	public static Subtitles[] createSubtitle(Scanner scanner,Subtitles[] arraySubtitlesGeneral) 
	{
		System.out.println("Select the subtitle to create:\n"
				+ "[1] ES\n"
				+ "[2] EN\n"
				+ "[3] DE\n"
				+ "[4] RU\n"
				+ "[5] IT\n"
				+ "[6] CH\n"
				+ "[7] OTHER");
		int selectedSubtitle=scanner.nextInt();
		AvaliableSubtitles subtitleToAdd=AvaliableSubtitles.OTHER;
		if (selectedSubtitle==1) 
		{
			subtitleToAdd=AvaliableSubtitles.ES;
		}
		else if (selectedSubtitle==2) 
		{
			subtitleToAdd=AvaliableSubtitles.EN;
		}
		else if (selectedSubtitle==3) 
		{
			subtitleToAdd=AvaliableSubtitles.DE;
		}
		else if (selectedSubtitle==4) 
		{
			subtitleToAdd=AvaliableSubtitles.RU;
		}
		else if (selectedSubtitle==5) 
		{
			subtitleToAdd=AvaliableSubtitles.IT;
		}
		else if (selectedSubtitle==6) 
		{
			subtitleToAdd=AvaliableSubtitles.CH;
		}
		else if (selectedSubtitle==7) 
		{
			subtitleToAdd=AvaliableSubtitles.OTHER;
		}
		Subtitles newSubtitle =new Subtitles(subtitleToAdd);
		arraySubtitlesGeneral=Arrays.copyOf(arraySubtitlesGeneral, arraySubtitlesGeneral.length+1);
		arraySubtitlesGeneral[arraySubtitlesGeneral.length-1]=newSubtitle;
		System.out.println(arraySubtitlesGeneral[arraySubtitlesGeneral.length-1]);
		
		return arraySubtitlesGeneral;
	}
	
	public static void showSubtitles(Subtitles[] arraySubtitlesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Avaliable Subtitles");
		System.out.println(Arrays.toString(arraySubtitlesGeneral));
	}
	
	public static Subtitles[] modifySubtitle(Scanner scanner,Subtitles[] arraySubtitlesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the subtitles you want to modify");
		System.out.println(Arrays.toString(arraySubtitlesGeneral));
		System.out.println("Use the numbers from 1 to "+arraySubtitlesGeneral.length+"\n");
		int numSubtitles=scanner.nextInt();
		numSubtitles--;
		System.out.println("What subtitle you want to tranform it in\n"
				+ "[Numbers from 1 to 7]");
		System.out.println("ES, EN, DE, RU, IT, CH, OTHER");
		int selection = scanner.nextInt();
		switch(selection)
		{
			case 1:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.ES);
				break;
			}
			case 2:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.EN);
				break;
			}
			case 3:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.DE);
				break;
			}
			case 4:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.RU);
				break;
			}
			case 5:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.IT);
				break;
			}
			case 6:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.CH);
				break;
			}
			case 7:
			{
				arraySubtitlesGeneral[numSubtitles].setSubtitle(AvaliableSubtitles.OTHER);
				break;
			}
		
		}
		
		return arraySubtitlesGeneral;
		
	}
	
	public static Subtitles[] deleteSubtitle(Scanner scanner,Subtitles[] arraySubtitlesGeneral) 
	{
		ScreenUtilities.clearScreen();
		System.out.println("Select the subtitles you want to delete");
		System.out.println(Arrays.toString(arraySubtitlesGeneral));
		
		System.out.println("Use the numbers from 1 to "+arraySubtitlesGeneral.length+"\n");
		int numSubtitles=scanner.nextInt();
		if(numSubtitles<arraySubtitlesGeneral.length) 
		{
			numSubtitles--;
			System.out.println("Subtitle to delete -> "+arraySubtitlesGeneral[numSubtitles]);
			System.arraycopy(arraySubtitlesGeneral, numSubtitles+1, arraySubtitlesGeneral, numSubtitles, arraySubtitlesGeneral.length-(numSubtitles+1));
			
		}
		arraySubtitlesGeneral=Arrays.copyOf(arraySubtitlesGeneral,arraySubtitlesGeneral.length-1);
		System.out.println(Arrays.toString(arraySubtitlesGeneral));
		
		return arraySubtitlesGeneral;
	}
	
}
