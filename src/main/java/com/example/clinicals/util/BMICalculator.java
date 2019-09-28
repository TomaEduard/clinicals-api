package com.example.clinicals.util;

import java.util.List;

import com.example.clinicals.entity.ClinicalData;

public class BMICalculator {

	public static void calculateBMI(List<ClinicalData> clinicalData, ClinicalData eachEntry) {
		if (eachEntry.getComponentName().equals("hw")) {
			// split elements with "/", set height = index[0] and weight = index[1]
			String[] heightAndWeight = eachEntry.getComponentValue().split("/");

			if (heightAndWeight != null && heightAndWeight.length > 1) {

				// convert height in meter for first value (index[0])
				float heightInMeters = Float.parseFloat(heightAndWeight[0]) * 0.4636F;
				// calculate the bmi with second number / firstone*2
				float bmi = Float.parseFloat(heightAndWeight[1]) / (heightInMeters * heightInMeters);

				ClinicalData bmiData = new ClinicalData();
				bmiData.setComponentName("bmi");
				bmiData.setComponentValue(Float.toString(bmi));

				clinicalData.add(bmiData);
			}

		}
	}
}
