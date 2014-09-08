import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class Mario{
	public static void main (String[] args) throws IOException{
	int height;
	Scanner input = new Scanner(System.in);
	do
	{
		height = input.nextInt();
	}
	while (height < 0 || height > 23);
	for (int x = 0; x < height - 1; x++)
	{
		for (int space = 0; space < height - x - 2; space++)
		{
			System.out.print(" ");
		}
		for (int hash = 0; hash < x + 2; hash++)
		{
			System.out.print("#");
		}
		System.out.println("");
	}
	}
}