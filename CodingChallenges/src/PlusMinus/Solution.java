package PlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

	static void plusMinus(List<Integer> arr) {
		
		double[] result = new double[3];
		   
		   NumberFormat formatter = new DecimalFormat("#0.000000");
		   
		   for (int x: arr){
		       if (x>0){
		           result[0]++;
		       }else if(x<0){
		           result[1]++;
		       }else{
		           result[2]++;
		       }
		       
		   }
		   
		    
		 System.out.println(formatter.format(result[0] / arr.size()));
		        System.out.println(formatter.format(result[1] / arr.size()));
		        System.out.println(formatter.format(result[2] / arr.size()));
		        
		    } 

	}

