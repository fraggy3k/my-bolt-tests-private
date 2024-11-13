package org.smartdatahub.liq.entity.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CompareHelper {

	private boolean isEqual = true;
	private List<DiffEntry> entries = new LinkedList<>();

	public void append(String fieldName, Object leftValue, Object rightValue) {
		if (!Objects.equals(leftValue, rightValue)) {
			DiffEntry entry = new DiffEntry(fieldName, leftValue, rightValue);
			entries.add(entry);
			isEqual = false;
		}
	}

	public boolean isEqual() {
		return isEqual;
	}



	public List<DiffEntry> getEntries() {
		return entries;
	}
	
	



	@Override
	public String toString() {
		return "CompareResult: \n"+entries.stream().map(e -> e.toString()).collect(Collectors.joining("\t","\n\t","\n"));
	}


	class DiffEntry {
		String fieldName;
		Object leftValue;
		Object rightValue;

		public DiffEntry(String fieldName, Object leftValue, Object rightValue) {
			super();
			this.fieldName = fieldName;
			this.leftValue = leftValue;
			this.rightValue = rightValue;
		}

		@Override
		public String toString() {
			String s = "Field " + fieldName + " changed: " + leftValue + " != " + rightValue;
			return s;
		}

	}
}
