package test;

/**
 * @author Christopher Moffett
 * Class CSCI 114
 * Homework P5.4
 * 2/25/16
 */

public class P5_4 {
	private final double FLOZ_TO_ML = 29.5735;
	private final double GAL_TO_ML = 3785.41;
	private final double OZ_TO_GRAMS = 28.3495;
	private final double LBS_TO_GRAMS = 453.592;
	private final double IN_TO_MM = 25.4;
	private final double FT_TO_MM = 304.8;
	private final double MI_TO_MM = 1609000;
	private String fromUnit;
	private String toUnit;
	private double result;
	private boolean volume, mass, length;
	private boolean volume2, mass2, length2;
	
	public void fromUnit(String unit){
		fromUnit = unit;
		if ((fromUnit.equalsIgnoreCase("flOz")) || (fromUnit.equalsIgnoreCase("gal")))
		{
			volume = true;
		}
		if ((fromUnit.equalsIgnoreCase("oz")) ||(fromUnit.equalsIgnoreCase("lbs")))
		{
			mass = true;
		}
		if ((fromUnit.equalsIgnoreCase("in")) || (fromUnit.equalsIgnoreCase("ft"))
				|| (fromUnit.equalsIgnoreCase("mi")))
		{
			length = true;
		}
		
	}
	
	public void toUnit(String unit){
		toUnit = unit;
		if ((toUnit.equalsIgnoreCase("ml")) || (toUnit.equalsIgnoreCase("L")))
		{
			volume2 = true;
		}
		if ((toUnit.equalsIgnoreCase("g")) || (toUnit.equalsIgnoreCase("kg")))
		{
			mass2 = true;
		}
		if ((toUnit.equalsIgnoreCase("mm")) || (toUnit.equalsIgnoreCase("cm")) || (toUnit.equalsIgnoreCase("m")) 
				|| (toUnit.equalsIgnoreCase("km")))
		{
			length2 = true;
		}
	}

	public double unitConverter(double value){

		if (volume && volume2){
			result = volumeConverter(value);
			return result;
		} else if (mass && mass2){
			result = massConverter(value);
			return result;
		} else if (length && length2){
			result = lengthConverter(value);
			return result;
		} else {
			System.out.println("Units are unconvertible. Please change unit types.\n");
			return 0;
		}
		
		
	}
	
	public double volumeConverter(double value){
		double result;
		if (fromUnit.equalsIgnoreCase("flOz"))
		{
			if (toUnit.equalsIgnoreCase("ml"))			
			{
				result = value * FLOZ_TO_ML; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("L"))			
			{
				result = value * (FLOZ_TO_ML / 1000); 
				return result;
			} 
		}
		if (fromUnit.equalsIgnoreCase("gal"))
		{
			if (toUnit.equalsIgnoreCase("ml"))			
			{
				result = value * GAL_TO_ML; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("L"))			
			{
				result = value * (GAL_TO_ML / 1000); 
				return result;
			} else {
				System.out.println("Error");
				return -1;
			}
		} else {
			System.out.println("Error");
			return -1;
		}
	}
	
	public double massConverter(double value){
		double result;
		if (fromUnit.equalsIgnoreCase("oz"))
		{
			if (toUnit.equalsIgnoreCase("g"))			
			{
				result = value * OZ_TO_GRAMS; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("kg"))			
			{
				result = value * (OZ_TO_GRAMS / 1000); 
				return result;
			} 
		}
		if (fromUnit.equalsIgnoreCase("lbs"))
		{
			if (toUnit.equalsIgnoreCase("g"))			
			{
				result = value * LBS_TO_GRAMS; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("kg"))			
			{
				result = value * (LBS_TO_GRAMS / 1000); 
				return result;
			} else {
				System.out.println("Error");
				return -1;
			}
		} else {
			System.out.println("Error");
			return -1;
		}
	}
	
	public double lengthConverter(double value){
		double result;
		if (fromUnit.equalsIgnoreCase("in"))
		{
			if (toUnit.equalsIgnoreCase("mm"))			
			{
				result = value * IN_TO_MM ; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("cm"))			
			{
				result = value * (IN_TO_MM / 10); 
				return result;
			} 
			if (toUnit.equalsIgnoreCase("m"))			
			{
				result = value * (IN_TO_MM / 1000); 
				return result;
			} 
			if (toUnit.equalsIgnoreCase("km"))			
			{
				result = value * (IN_TO_MM / 1000000); 
				return result;
			} 
		}
		if (fromUnit.equalsIgnoreCase("ft"))
		{
			if (toUnit.equalsIgnoreCase("mm"))			
			{
				result = value * FT_TO_MM; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("cm"))			
			{
				result = value * (FT_TO_MM / 10); 
				return result;
			} 
			if (toUnit.equalsIgnoreCase("m"))			
			{
				result = value * (FT_TO_MM / 1000); 
				return result;
			} 
			if (toUnit.equalsIgnoreCase("km"))			
			{
				result = value * (FT_TO_MM / 1000000); 
				return result;
			} 
		}
		if (fromUnit.equalsIgnoreCase("mi"))
			{
			if (toUnit.equalsIgnoreCase("mm"))			
			{
				result = value * MI_TO_MM; 
				return result;
			}
			if (toUnit.equalsIgnoreCase("cm"))			
			{
				result = value * (MI_TO_MM / 10); 
				return result;
			} 
			if (toUnit.equalsIgnoreCase("m"))			
			{
				result = value * (MI_TO_MM / 1000); 
			return result;
			} 
			if (toUnit.equalsIgnoreCase("km"))			
			{
				result = value * (MI_TO_MM / 1000000); 
				return result;
			} else {
				System.out.println("Error");
				return -1;
			}
		} else {
			System.out.println("Error");
			return -1;
		}
		
	}	
}
